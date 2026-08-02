
class A extends  Object{
    public A(){

 super();
System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("In A int");
    }
 
}

class B extends A{
 
 public B(){

 super();// executes the constructor of a super class
 System.out.println("In B");

 }
 public B(int n){
    this();//executes a constructor in the same class
    System.out.println("In B int");
 }
}

public class Super{

    public static void main(String[] args){
        B obj= new B(7);
    
    }
}