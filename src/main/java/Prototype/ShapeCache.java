package Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by my on 2017/3/7.
 */
public class ShapeCache {




    //当然高并发的时候 是不是需要换成并发安全的map呢
    private static Map<String, Shape> map = null;


    public static void loadCache(){

        /*假设下面创建对象很慢 或者是某个环境下需要创建对象的对象特多 或者是创建对象比较麻烦 所以我们可能希望麻烦一次就好了 别老麻烦人
        这样的话就把创建好的对象能clone或者是保存起来用的时候clone 确实方便哈
        */
        Rectangle r = new Rectangle();
        r.setId(1);
        r.setType("rectangle");
        //Thread.sleep(5000); 模拟创建的慢
        Square s = new Square();
        s.setId(2);
        s.setType("square");

        map = new HashMap(){
            {
                put("r",r);
                put("s",s);

            }
        };

    }


    public static Shape getShape(String string) throws CloneNotSupportedException {

        Shape shape = map.get(string);
        return (Shape) shape.clone();
    }
}
