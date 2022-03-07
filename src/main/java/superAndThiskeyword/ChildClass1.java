package superAndThiskeyword;

public class ChildClass1 extends ParentClass1
{
    int d;
    int e;

    ChildClass1(String b , double c, int e)
    {
        super(b,c);
        this.e=e;
        System.out.println(super.b);
        System.out.println(super.c);
        System.out.println(e);

        System.out.println("This is my Child Class");

    }
    public int methodChildClass(){
        super.ParentMethod(20);
        //  System.out.println("This is my Child Class :"+d);
        this.d = d;
        return d;
    }


}
