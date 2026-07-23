
class Mobile{
   String brand;
   int price;
   //static helper variable is used to share the value of a variable with all objects of the class
    static String name;
    
    public void show(){
      System.out.println(brand+" "+price+" "+name);  
    }
   
}

public class Demo{
    public static void  main(String a[]){
         Mobile obj1=new Mobile();
obj1.brand="Apple";
obj1.price=50000;
Mobile.name="iPhone";
   
Mobile obj2=new Mobile();
obj2.brand="Samsung";
obj2.price=40000;
Mobile.name="Galaxy";

obj1.show();
obj2.show();

    }
}