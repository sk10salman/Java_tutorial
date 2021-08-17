public class Two_dim_array {
    public static void main(String[] args)
    {
        int x[][]={{5,6,4,2}};

        System.out.println("Hey How are you"+x.length);
        for(int i=0;i<x.length;i++)
         for(int j=0;j<x[0].length;j++)
          System.out.println(x[i][j] + " ");

        // Enhance For Loop

        for(int [] i:x)
         for(int j:i)
         {
             System.out.println(j);
         }


        // Jagged Array
        int p[][]={{5,6,4,2},
                   {1,2,3},
                   {1,2},
                   {1}};

   for(int [] i :p)
     for(int j:i)
     {
         System.out.print(j + " ");
     }
       

    }
}
