package superAndThiskeyword;

public class ParentClass1 {

    int a;
    String b;
    double c;

    //Two Parameter Constructor
    ParentClass1(String b, double c)
    {
        this.b = b;
        this.c = c;
    }

    public int parentMethod(int a)
    {
        this.a = a;
        System.out.println("Parent Method: "+a);
        return a;
    }

    protected void ParentMethod(int i) {
    }
}
