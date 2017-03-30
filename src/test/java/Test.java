import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by my on 2017/2/19.
 */
public class Test {




    @org.junit.Test
    public void test(){

        String test1 = "mengyue";


        String test2 = "mengyue";

        String ss = "mengyue$";

        Pattern pattern = Pattern.compile(ss);

        Matcher m = pattern.matcher(test1);

        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );

        } else {
            System.out.println("NO MATCH");
        }


    }


}
