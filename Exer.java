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
   
    Car obj= new Car();
    obj.drive();
    obj.playMusic();

    }}
