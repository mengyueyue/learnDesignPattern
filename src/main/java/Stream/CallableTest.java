package Stream;

/**
 * Created by huang-xingbiao on 2017/2/12.
 */
public class CallableTest {

    public static void main(String[] args) throws InterruptedException {

        CallableFuture<Integer> callableFuture = new CallableFuture<>(() -> {
            Thread.sleep(3000);
            return 1;
        });
        new Thread(callableFuture).start();
        System.out.println(callableFuture.get());
    }

}


class CallableFuture<T> implements Runnable {

    private Callable_<T> callable_;

    private T t;

    private boolean ran = false;

    public CallableFuture(Callable_<T> callable_) {
        this.callable_ = callable_;
    }

    @Override
    public void run() {
        try {
            synchronized (this) {
                this.t = callable_.call();
                this.notify();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public T get() throws InterruptedException {
        synchronized (this) {
            if (!ran) {
                this.wait();
            }
            return this.t;
        }
    }

}

@FunctionalInterface
interface Callable_<T> {

    T call() throws Exception;
}