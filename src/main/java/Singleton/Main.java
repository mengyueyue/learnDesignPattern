package Singleton;

/**
 * Created by my on 2017/2/12.
 */
public class Main {


    public static void main(String[] args) {


        System.out.println(EnumSingleton.INSATNCE);



        InnerSingleton ls = InnerSingleton.getInstance();

        InnerSingleton lss = InnerSingleton.getInstance();

        System.out.println(lss);
        System.out.println(ls);


    }
}
