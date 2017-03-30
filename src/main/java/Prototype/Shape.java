package Prototype;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * Created by my on 2017/3/7.
 */
public abstract class Shape implements Cloneable{



    private Integer id;
    protected String type;


    abstract void draw();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //浅克隆的话 会把基本类型和String 这一类的copy一份 对象类型的和数组类型的不会复制 只会拿引用而已 所以浅克隆的对象和原型指向的对象的地址一样哦
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //deepClone 的话  它提倡的是 把原型对象的对象字段什么的 也复制一份 然后如果这个对象还有引用其他对象 也要复制一份 也就是 clone后的对象以及他的引用对象都是新的哦 也就是地址不一样哦

    //当然除了序列化到file中 还可以序列化到其他byte或者是byteArray中 什么的 甚至数据库中
    protected Object deepClone() throws Exception {

        FileOutputStream fos = new FileOutputStream(new File("file.out"));
        //ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //ByteOutputStream bos = new ByteOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this);
        FileInputStream fis = new FileInputStream(new File("file.out"));
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        return o;
    }

}
