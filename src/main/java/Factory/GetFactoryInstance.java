package Factory;

/**
 * Created by my on 2017/1/1.
 */
public class GetFactoryInstance {


    public static void main(String[] args) {

        SendFactory instance = new SendFactory();

        instance.send("mail").send();
        instance.send("phone").send();
    }


}
