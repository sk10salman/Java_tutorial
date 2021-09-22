import java.util.Scanner;
class Hello{
 
    public  void fun()
    {
        Scanner sc =new Scanner(System.in);
         System.out.println("Hey How are you");
        
         String s=sc.nextLine();
         System.out.println(s);
      sc.close();

    }
    public static void array()
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
          arr[i]=i+10;
        for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]+" ");
         sc.close();
    }
    public static void main(String[] args)
    {
        System.out.println("Hello Salman");
        array();
       
    }
}
