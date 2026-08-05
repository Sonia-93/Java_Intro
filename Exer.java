
interface A{
    void show();
    void config();
}
class B implements A{
     
     public void show(){
        System.out.println("In Show");
     }

     public void config(){
        System.out.println("In config");   
     }
}

public class Exer {

     public static void main (String a[]){
   
     A obj=new B();
     obj.show();
     obj.config();
      
    }} 









 /* Car obj= new BMW();
    obj.drive();
    obj.playMusic();
    //example of downcasting
    BMW obj1=(BMW)obj;
    obj1.drive();*/