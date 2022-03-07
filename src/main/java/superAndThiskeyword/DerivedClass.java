package superAndThiskeyword;

public class DerivedClass {

    public static void main(String[] args)
    {
        ChildClass obj = new ChildClass("Hello",9,2);
        obj.childMethod(30);
        int f = obj.a=140;
        System.out.println("ChildMethod: "+f);

    }
}
