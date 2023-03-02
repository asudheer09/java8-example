package com.example.java8;


interface Servlet{

    //public abstract are optional by default it will treat them
     void init();
    void service();
    void destroy();
}

 abstract class  GenericServlet implements Servlet{

     @Override
     public void init() {

     }

     @Override
     public void destroy() {

     }
 }

 class MyOwnServlet extends GenericServlet{

     @Override
     public void service() {

     }
 }

 class MySecondServlet implements  Servlet{

     @Override
     public void init() {

     }

     @Override
     public void service() {

     }

     @Override
     public void destroy() {

     }
 }

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

        Z z= new Z();
        z.method1();

    }
}

/*
class A{
   void method1(){}

}

class B{
    void method1(){}
}
class C extends A,B{
    C c= new C();
    c.method1()
}*/

interface  X{
    abstract void method1();
}

interface  Y{
    abstract void method1();
}

class Z implements X,Y {

    @Override
    public void method1() {
        System.out.println("method1");
    }
}


