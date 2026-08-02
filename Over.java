  import javax.swing.SpringLayout;
  
  //overriding is how methods have the same name but different implementation in the child class.
 class A{ 

public void show(){ 
    System.out.println("In  A Show");
}

public void config(){
    System.out.println("In Config");
}

}
class B extends A{
 public void show(){
    System.out.println("In Show B");
}
}
public class Over{
    
    public static void main(String a[]){

  B obj=new B();
  obj.show();
  obj.config();
    }
}