package Adapter;

/**
 * Created by my on 2017/3/23.
 */
public class Adapter implements Target{


    private Adaptee adaptee;



    public Adapter(Adaptee adaptee){

        this.adaptee = adaptee;
    }


    @Override
    public void request() {


        adaptee.specificRequest();

    }
}

class Client{


    public static void main(String[] args) {


        Adaptee adaptee = new Adaptee();

        Adapter adapter = new Adapter(adaptee);

        adapter.request();

    }

}