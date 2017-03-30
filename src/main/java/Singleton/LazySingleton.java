package Singleton;

/**
 * Created by my on 2017/2/12.
 */
//懒汉单利模式 线程不安全啊
public class LazySingleton {


    private static  LazySingleton ls;

    //懒汉 不安全
    public static LazySingleton getInstance(){//


        if (ls==null){
            ls = new LazySingleton();
            return ls;
        }
        return ls;
    }


    //饿汉 安全 缺点在第一次加载完以后 想要调用的时候 都必须串行判断 所以还是慢
    public static synchronized LazySingleton  getInstanceSecurity(){

        if (ls==null){

            ls = new LazySingleton();
            return ls;

        }

        return ls;
    }


    private volatile static  LazySingleton lss ;

    //双重锁 饿汉 安全 第一次串行慢 以后调用就不慢了
    public static LazySingleton getInstanceDoubelSecurity(){

        if (lss==null){
            synchronized (LazySingleton.class){

                if (lss==null){
                    lss = new LazySingleton();
                }
            }
        }
        return lss;
    }



}
