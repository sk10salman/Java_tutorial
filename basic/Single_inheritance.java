public class Single_inheritance {
    public static void main(String[] args)
    {
        Child obj=new Child(5,3);
       
        obj.add();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
    }
}
class Parent{
   int num1,num2;
    int result;
    
    void add()
    {
        result=num1+num2;
    }
}
class Child extends Parent{
    public Child(int a,int b)
    {
        num1=a;
        num2=b;
    }
      void sub()
      {
              result=num1-num2;
      }
}