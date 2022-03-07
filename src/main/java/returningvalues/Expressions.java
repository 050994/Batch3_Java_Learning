package returningvalues;

public class Expressions {
    public int method(int l , int w)
    {

        int area = l * w;
        System.out.println(area);
        this.method(w);
        return area;


    }
    public int method(int s)
    {
        int area1 = s*s;
        System.out.println(area1);
        return area1;

    }

    public static void main(String[] args)
    {
        Expressions obj = new Expressions();
        obj.method(9,7);
    }
}
