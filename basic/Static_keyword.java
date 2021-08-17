public class Static_keyword {

    public static  void main(String[] args)
    {
        
        
        Abc.show();
    }
    
}

class Abc{
    static int i;
    public Abc()
    {
        i++;
    }
    public static  void show()
    {
        System.out.println("Object count of Abc is " + i);
    }
}
