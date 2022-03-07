package constructor;

public class ParametrizedC
{

    // instance variable declaration
    int a;
    String b;
    ParametrizedC (int x, String y)
    {
        a = x;
        b = y;
        System.out.println("parametrized constructor: ");
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args)
    {

        ParametrizedC obj = new ParametrizedC(28,"Karthiga");
        // for instance variables
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
