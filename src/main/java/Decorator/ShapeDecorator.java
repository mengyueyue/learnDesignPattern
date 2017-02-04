package Decorator;

/**
 * Created by my on 2017/2/4.
 */
public abstract class ShapeDecorator implements Shape{


    protected Shape decoratorShape;


    public  ShapeDecorator(Shape decoratorShape){

        this.decoratorShape = decoratorShape;

    }

    public void draw(){
        decoratorShape.draw();
    }


}
