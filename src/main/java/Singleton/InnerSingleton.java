package Singleton;

/**
 * Created by my on 2017/2/12.
 */
public class InnerSingleton {


    private InnerSingleton() {

    }


    //不清楚为什么要加final关键字呢？？？？？？？？？？？

    private static class Inner{

        private static InnerSingleton Instance = new InnerSingleton();// final
    }


    public static InnerSingleton getInstance(){//final

        return Inner.Instance;
    }


}
