public class multi_level {
    public static void main(String[] args)
    {
        MultiSubAdd obj=new MultiSubAdd();
        obj.num1=5;
        obj.num2=3;
        obj.add();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
        obj.multi();
        System.out.println(obj.result);

    }
}

class Add{
     int num1,num2, result;
     
     public void add()
     {
         result=num1+num2;
     }
 }
 class SubAdd extends Add{
    
      public void sub()
       {
               result=(num1-num2);
            
       }
 }
 class MultiSubAdd extends SubAdd{
    public void multi()
     {
         result=num1*num2;
     }
 }