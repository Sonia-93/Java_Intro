class A{

public void show1(){
    System.out.println("In A show");
 }
}

class B extends A{
public void show2(){
    System.out.println("In B show");
 }
}


public class Exer {

     public static void main (String a[]){
    //Upcasting
     A obj= (A) new B();
     obj.show1();
 
 
    }
}