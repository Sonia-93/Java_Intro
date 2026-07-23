
class Computer{

    
    public void playMusic(){
      System.out.println("Music playing");
    }
    public String getMeApen(int cost){
        return "Pen";
    }
}

public class Demo{
    public static void  main(String a[]){
      Computer obj=new Computer();
      obj.playMusic();
     String str= obj.getMeApen(100);
     System.out.println(str);
    }
}