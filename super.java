public class Main
{
    public static void main(String[] args)
    {
        football f=new football();
    }
}
class Sport
{int s=10;
    Sport()
    {
        System.out.println("It is a sport");
    }
}
class Cricket extends Sport{
       Cricket()
       {
           super();
           System.out.println("Cricket");
       }
}
class football extends Cricket{
    football()
    {
        System.out.println("Football");
        System.out.println(super.s);
    }
}