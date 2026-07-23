
class Mobile{
   String brand;
   int price;
   String name;
    
    public void show(){
      System.out.println(brand+" "+price+" "+name);  
    }
   
}

public class Demo{
    public static void  main(String a[]){
         Mobile obj1=new Mobile();
obj1.brand="Apple";
obj1.price=50000;
obj1.name="iPhone";
   
Mobile obj2=new Mobile();
obj2.brand="Samsung";
obj2.price=40000;
obj2.name="Galaxy";

    }
}