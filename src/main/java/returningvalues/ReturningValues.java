package returningvalues;

public class ReturningValues {
    static int m;
    static int n;
    public void methodname1(int x, int y)
    {
        System.out.println(("not returning any value"));
        //int c = x+y;
        n = x+y;
        //System.out.println(n);

    }
    public int addtion(int a , int b)
    {

        return  (a+b);

    }

    public static void main(String[] args)
    {
        ReturningValues obj = new ReturningValues();
        obj.methodname1(90,90);
        System.out.println(n);
        System.out.println(m =obj.addtion(89,90));


    }

}
