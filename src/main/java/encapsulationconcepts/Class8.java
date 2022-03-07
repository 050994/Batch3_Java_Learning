package encapsulationconcepts;

public class Class8 {
    public static void main(String[] args) {
       Class7 obj = new Class7();
        obj.setA(50);
        obj.setB(80);
        obj.setC(60);
        String biggestNumber =  obj.methodname(obj.getA(),obj.getB(),obj.getC());
        System.out.println(biggestNumber);
        //System.out.println(obj.getA());
        // System.out.println(obj.getA()+10);

    }
}
