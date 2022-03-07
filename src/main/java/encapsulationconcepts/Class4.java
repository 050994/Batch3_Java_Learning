package encapsulationconcepts;

public class Class4 {
    public static void main(String[] args)
    {
        Class3 obj =  new Class3();

        obj.setA(56);
        obj.setB(42);
        obj.setC(18);
        System.out.println("Given numbers are ");
        System.out.println(" a =  " +obj.getA());
        System.out.println(" b =  " +obj.getB());
        System.out.println(" c =  " +obj.getC());

        //  objname.meth(8,19,3);
        obj.methodname();



    }

    private void methodname() {
    }
}
