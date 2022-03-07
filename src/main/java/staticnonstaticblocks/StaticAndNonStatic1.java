package staticnonstaticblocks;

public class StaticAndNonStatic1 {
    int a;
    static int b;
    final int c = 1;


    /* int a;
    StaticNonStaticBlocks(int a){
        this.a = a;
        System.out.println(a);*/
    /**/

    //STATIC AND NON-STATIC COMES IN ORDER
    StaticAndNonStatic1()
    {
        //zero or non-parameterised constructor
        System.out.println("im am constructor");

    }
    //Non-Static Blocks
    {
        System.out.println("Hi im non-static block");
        a = 4;
    }
    //Non-Static Block
    {
        System.out.println("Altering non-static block");
        a = 6;
    }

    //Static Block - belongs to class
    static
    {
        System.out.println("Hi im static block");
        b = 5;
    }
    //Static Block - belongs to class
    static
    {
        System.out.println("Altering im static block");
        b = 9;
    }


    public static void main(String[] args)
    {
        StaticAndNonStatic1 obj = new StaticAndNonStatic1();
        System.out.println(obj.a);
        System.out.println(b); // for static no need to give obj
    }
}
