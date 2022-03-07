package encapsulationconcepts;

public class Class3 {

    private int a ;
    private int b;
    private int c;

    public int getA()
    {
        return a;
    }

    public void setA(int a1)
    {
        this.a = a1;
    }

    public int getB()
    {
        return b;
    }

    public void setB(int b1)
    {
        this.b = b1;
    }

    public int getC()
    {
        return c;
    }

    public void setC(int c1)
    {
        this.c = c1;
    }
    public void methodname()
    {
        if ((a > b) && (b >c))
        {
            System.out.println(" a is the bigger");
        }
        else if (( b > c) && (c > a))
        {
            System.out.println("b is the bigger value");
        }
        else
        {
            System.out.println("c is the bigger number");
        }
    }
    public void meth(int l , int m , int n)
    {
        this.a = l;
        this.b = m;
        this.c = n;
    }

}
