
class Human{
private int age;
private String name;
//constructor should have no return type  and the same name as the class
//default constructor
public Human(){
    age=12;
    name="sonia";
}
//Parametarized constructor
public Human(int a, String n){
age=a;
name=n;
}

public int getAge(){
    return age;
}

public void setAge(int age){
 this.age=age;//this represents the current object and refering to instance variable of that onject
}
public void setName(String name){
 this.name=name;
}

public String getName(){
    return name;
}
}
public class Enc{
    
    public static void main(String a[]){

  Human obj=new Human();
   Human obj1=new Human( 18,"sonia");
  
   //obj.setName("sonia");
 // obj.setAge(11);
  System.out.println(obj.getName());
  System.out.println(obj.getAge());

   System.out.println(obj1.getName());
  System.out.println(obj1.getAge());

  
    }
}
 