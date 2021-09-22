public class Abstract_class {
    public static void main(String[] arg)
    {
          // MaheshPhone obj= new MaheshPhone(); // cannot instantiate of tge abstract class 
           SureshPhone obj=new SureshPhone();
           obj.call();
           obj.move();
           obj.dance();
           obj.cook();
    }
}
abstract class MaheshPhone
{
    public void call()
    {
        System.out.println("calling.....");
    }
    public abstract void move();// call as abstract methods then call should be abstract
    public abstract void dance();
    public abstract void cook();
}
abstract class RameshPhone extends MaheshPhone
{
           public void move()
           {
               System.out.println("Moving....");
           }

} 
class SureshPhone extends RameshPhone  //concrete class
{
    // SureshPhone can access all the methods
    public void dance()
    {
         System.out.println("Dancing...");
    }
    public void cook()
    {
         System.out.println("Cooking...");
    }
}
