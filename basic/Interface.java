

interface Abcd
{
     void show(); // by defaul public abstract
}

interface Pqr
{
    void display();
}

class AbcImpl implements Abcd,Pqr
{
    public void show()
    {
        System.out.println("Showing....");
    }
    public void display()
    {
        System.out.println("Display....");
    }
    
}

public class Interface {
    public static void main(String[] args)
    {
          //   Abc obj=new Abc();   cant instantiated error
            AbcImpl obj = new AbcImpl();
            obj.show();
            obj.display();
            System.out.println(obj);
        }
}
