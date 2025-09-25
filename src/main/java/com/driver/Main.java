package com.driver;

public class Main {
  public static void main(String[] args){
      B obj1 = new B();
      String ans1 = obj1.meth();
      B obj2 = new B();
      String ans2 = obj2.meth();
      System.out.println(ans2);

  }
    public class A {
        public String  meth(){
            return "Invoking method from class A";
        }


    }
    public class B extends A{
        public  String  meth(){
            return "Method is overridden in Extended class B";
        }
    }

}



