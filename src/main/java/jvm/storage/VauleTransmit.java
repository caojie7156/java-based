package jvm.storage;

import entity.JavaClass;

public class VauleTransmit {
    public static void main(String[] args) {
    /*sum:
    1.jvm并不关心stack中对象引用的地址，而关心实例的内存地址，修改的内存地址的数据，包装类和基础类其实也是值传递，但每次传递数据为一个整体，无法对进行修改，而对象能对属性通过方法调用进行修改，就产生了基本类型是值传递，对象是引用传递的感觉，本质都是把数据的内存地址指向对象引用
    2.C++引用传递和java对象的值传递类型，但java可以随便变化，因为相当于拷贝了一份内存地址给新的对象引用，C++直接通过指针指向内存地址，不可以再进行更改，两者都是可以更改内存的数据但不能更改内存的地址
    3.最后的本质都是指针的操作
     */

        //java值引用：javaClass是一个对象引用，就是一个表示，第一次在heap中创建，第二次指向javaClass01创建时开辟的heap空间
        //hashcode()打印是内存地址，和直接输出对象名一样
        JavaClass javaClass = new JavaClass();
        System.out.println(javaClass.hashCode());
        System.out.println(System.identityHashCode(javaClass));
        JavaClass javaClass01 = new JavaClass();
        System.out.println(javaClass01.hashCode());
        javaClass = javaClass01;
        //对象==比较是开辟内存地址，没有重写所以等同于equals
        System.out.println(javaClass==javaClass01);
        System.out.println(javaClass.hashCode());
        System.out.println(System.identityHashCode(javaClass));
        System.out.println(System.identityHashCode(javaClass01));

        //System.identityHashCode 基本数据类型打印是对象引用内存地址，而对象都是开辟的内存地址。hashCode是开辟的内存地址，String为包装类，不是基本类型，但并不能修改值，跟基本类型一样
        System.out.println("------------");
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = s1+s2;
        String s5 ="hello";
        //基本类型==比较是开辟的内存地址，String的equals方法已经重写，比较的是值
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1==s5);
        //String包装类的hashCode已经重写，值的hashcode
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s5));

        //基本类型没有hashcode和equals,除非转为为包装类跟String类似
        System.out.println("----------------");
        Integer a1 = new Integer(1);
        Integer a2 = 2;
        Integer a3 = 1;
        Integer a4 = a1;
        System.out.println(System.identityHashCode(a1));
        //a3相当于又重新new了一个对象
        System.out.println(System.identityHashCode(a3));
        //a4则与a1相等
        System.out.println(System.identityHashCode(a4));
    }
}
