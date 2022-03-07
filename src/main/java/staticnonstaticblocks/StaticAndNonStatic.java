package staticnonstaticblocks;

public class StaticAndNonStatic {
    // default constructor
    StaticAndNonStatic()
    {
        System.out.println("This is a Zero Parameter Constructor");
    }
    // Non Static declaration :
    {
        System.out.println("This is Non static Block");
    }
    //Static declaration
    static
    {
        System.out.println("This is a Static Block");
    }

    public static void main(String[] args) {
        // creating an object for constructor and Nonstatic
        // order if precedence is static, nonstatic then Constructor
        StaticAndNonStatic objName = new StaticAndNonStatic();

    }

}
