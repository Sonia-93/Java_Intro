
class A{
    int age;
    public void show(){
        System.out.println("In A show");
        }

     class B{
  public void config(){
    System.out.println("In B config");
  }
     }
}
public class Exer {

     public static void main (String a[]){
   
    A obj= new A();
    obj.show();
      
      A.B obj1= new B();

    }}









 /* Car obj= new BMW();
    obj.drive();
    obj.playMusic();
    //example of downcasting
    BMW obj1=(BMW)obj;
    obj1.drive();*/