package Adapter;

/**
 * Created by my on 2017/3/23.
 */
public class Adapter2 extends Adaptee implements Target {


    @Override
    public void request() {

        this.specificRequest();
    }
}


class Client2{


    public static void main(String[] args) {

        Target t = new Adapter2();
        t.request();

    }


}