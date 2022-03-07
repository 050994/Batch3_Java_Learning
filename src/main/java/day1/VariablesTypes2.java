package day1;

public class VariablesTypes2 {

    float a;
    float b;
    float c;

    public void calculate(){
        a=10.2f;
        b=20.3f;
        c=a-b;

        System.out.println(+c);
    }

    public static void main(String[] args) {
        VariablesTypes2 obj=new VariablesTypes2();
        obj.calculate();
    }

}
