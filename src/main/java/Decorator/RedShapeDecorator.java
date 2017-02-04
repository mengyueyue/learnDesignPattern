package Decorator;

/**
 * Created by my on 2017/2/4.
 */
public class RedShapeDecorator extends ShapeDecorator {


    public RedShapeDecorator(Shape shape){

        super(shape);
    }

    public void draw(){

        setRedBorder();
        decoratorShape.draw();
    }

    public void setRedBorder(){

        System.out.println("Boder color : red ");
    }
}
