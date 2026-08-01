
class Mobile{
   String brand;
   int price;
   //static helper variable is used to share the value of a variable with all objects of the class
    String name;
    
    public void show(){
      System.out.println(brand+" "+price+" "+name);  
    }

    public static  void show1(Mobile obj){
         System.out.println(obj.brand+" "+obj.price+" "+obj.name); 
    }
   
}

public class Demo{
    public static void  main(String a[]){
         Mobile obj1=new Mobile();
obj1.brand="Apple";
obj1.price=50000;
Mobile.name="iPhone";
obj1.show();
//Mobile.show();
 Mobile obj2=new Mobile();
   obj2.brand="Samsung";
obj2.price=500;
obj2.show();

Mobile.show1(obj1);
    }
}