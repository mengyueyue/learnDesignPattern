package Prototype;

/**
 * Created by my on 2017/3/7.
 */
public class PrototypePatternDemo {


    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();
        Shape rectange = ShapeCache.getShape("r");
        Shape square = ShapeCache.getShape("s");

        rectange.draw();
        square.draw();

    }
}
