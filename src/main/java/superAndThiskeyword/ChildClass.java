package superAndThiskeyword;

public class ChildClass extends ParentClass1 {
    int a;
    int d;
    int e;

    //ChildClass Constructor
    ChildClass(String b, double c,int d) {
        super(b, c);
        this.d = d;

        System.out.println(super.b);
        System.out.println(super.c);
        System.out.println(d);
    }

    public int childMethod(int e)
    {
        this.e = e;
        super.parentMethod(2);
        return e;
    }
}
