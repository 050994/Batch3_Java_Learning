package encapsulationconcepts;

public class Class1 {

    //public int a = 100;
    //public String b = "Ishaan";
    private int a;
    private  String b;

    public int getA(int x)
    {
        this.a = x ;
        return a;
    }
    public String getB(String y)
    {
        this.b = y;
        return b;
    }



  /*  public static void main(String[] args) {
       Class1 obj = new Class1();
        System.out.println(obj.a);
        System.out.println(obj.b);
        //String b1 = obj.b;
    }*/
}
