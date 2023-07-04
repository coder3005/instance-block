/* Instance Block */
class A 
{
    int a,b;
   static void show()
    {
        System.out.println("abhi gupta");
    }
    A()
    {
        a=30; b=40;
        System.out.println(a+" "+b);
    }
    {
        a=10; b=20;
        System.out.println(a+" "+b);
    }
}
class B
{
    public static void main(String[] args) {
        
        A r=new A();
    }
}
