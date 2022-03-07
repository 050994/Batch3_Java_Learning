package encapsulationconcepts;

public class Class5 {

    private int  a;
    private int  b;
    private int  c;

    public int getA()

    {
        return a;
    }
    public int getB()

    {
        return b;
    }
    public int getC()

    {
        return c;
    }
    public void setA(int a)

    {
        this.a = a;
    }
    public void setB(int b)

    {
        this.b = b;
    }
    public void setC(int c)

    {
        this.c = c;
    }
    public  void methodname(int x,int y, int z)
    {
        setA(x);
        setB(y);
        setC(z);
        if ((a>=b) && (b>=c)) {
            System.out.println("a is bigger");
        }
        else if ((b>=c) && (c>=a))
        {
            System.out.println("b is bigger");
        }
        else
        {
            System.out.println( "c is bigger");
        }

    }
}
