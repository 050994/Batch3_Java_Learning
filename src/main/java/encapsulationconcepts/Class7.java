package encapsulationconcepts;

public class Class7 {
    private  int a;
    private int b;
    private  int c;

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public int getB()
    {
        return b;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public int getC()
    {
        return c;
    }

    public void setC(int c)
    {
        this.c = c;
    }
    public String  methodname(int a, int b, int c)
    {
        if (( a> b) && (a > c))
        {
            // System.out.println("a is biggest number");
            return "a is biggest number";
        }
        else if((b > c) && ( b > a))
        {
            // System.out.println("b is the biggest number");
            return "b is biggest number";
        }
        else if ((c > a) && (c > b))
        {
            //System.out.println("c is the biggest number");
            return "c is the biggest number";
        }
        else
        {
            return "Give distinct numbers";
        }
    }
}
