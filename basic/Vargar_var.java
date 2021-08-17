// vargar -> variable arguments
public class Vargar_var {
    public static void main(String[] args)
    {
         Display obj = new Display();
         obj.show(1);
         obj.show(1,2);
         obj.show(1,2,3,4,5);
    }
}
class Display
{
    void show(int a)
    {
         System.out.println("single parameter");
    }
    void show(int a,int b)
    {
        System.out.println("double parameter");
    }
    void show(int ... a)
    {
        for(int i:a)
          System.out.println(i);
    }
}
