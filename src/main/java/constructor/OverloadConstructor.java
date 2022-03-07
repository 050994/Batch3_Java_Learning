package constructor;

public class OverloadConstructor {
    OverloadConstructor()
    {
        System.out.println("zero Constructor");
    }
    OverloadConstructor(int x)
    {
        System.out.println("single parameter var x = " + x);
    }
    OverloadConstructor(int m ,String n)
    {
        System.out.println("two parameter var m = " + m);
        System.out.println("two parameter var n = " + n);

    }

    public static void main(String[] args)
    {
        OverloadConstructor obj1 = new OverloadConstructor(20,"Ishaan");
        OverloadConstructor obj2 = new OverloadConstructor(9);
        OverloadConstructor obj3 = new OverloadConstructor();
    }
}
