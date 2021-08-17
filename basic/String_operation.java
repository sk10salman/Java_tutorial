
public class String_operation {
    
    public static void main(String[] args)
    {
       // Scanner sc =new Scanner(System.in);
        String str="Hello";
        str="salman";
       String a="salmn";
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(a));
        str=str+"nnname";
        System.out.println(System.identityHashCode(str));
        

        

    }
}
