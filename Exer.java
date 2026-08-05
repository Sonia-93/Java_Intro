abstract class Car{
  
   public abstract void drive();


  public void playMusic(){
 System.out.println("Playing Music");
  }

}
class BMW extends Car{
  public void drive(){
    System.out.println("Driving BMW");
  }
}

public class Exer {

     public static void main (String a[]){
   
    Car obj= new BMW();
    obj.drive();
    obj.playMusic();
    //example of downcasting
    BMW obj1=(BMW)obj;
    obj1.drive();
     
    }}
