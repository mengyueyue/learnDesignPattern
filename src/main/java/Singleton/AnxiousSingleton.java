package Singleton;

/**
 * Created by my on 2017/2/12.
 */
//饿汉单利 线程安全 因为提前加载好了在java初始化类的时候
public class AnxiousSingleton {


    private AnxiousSingleton(){

    }

    private static AnxiousSingleton as = new AnxiousSingleton();

    public AnxiousSingleton getInstance(){

        return as;
    }


}
