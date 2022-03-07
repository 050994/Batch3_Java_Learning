package constructor;

public class ThisOverload {
    //int z = 100;
    ThisOverload()
    {

        System.out.println("zero constructor");
    }
    ThisOverload(int x )
    {

        System.out.println("single parameter x= " + x);
    }
    ThisOverload(int x, int y)
    {
        //this(x);
        this();

        System.out.println("two parameters o/p ");
        System.out.println(x);
        System.out.println(y);
    }
   /*This_overload(int x, int y , int z)
    {
        //this();
        this(x,y);
      //  z = this.z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }*/



    public static void main(String[] args)
    {
        ThisOverload obj = new ThisOverload(80,90);
        //This_overload obj1 = new ThisOverload(900);

    }

}
