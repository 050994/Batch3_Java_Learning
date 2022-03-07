package day1;

public class VariablesTypes1 {

    //Instance Variables-variables created inside d class n available throughout d class
    int var1 = 3;
    String var2 = "Hello";
    boolean var3 = true;

    //Static Variables (used for common data)-11,29
    static String var6 = "Canada";

    static Integer baseSalary = 100;
    /*Local Variables- are variables created inside the method (we need to create method[susmi] n
    name is anything its user defined one)-15to22,33
     */
    public void methodname ()
    {
        int var4 = 6;
        String var5 = "welcome";

        System.out.println(var4);
        System.out.println(var5 + " " + var6);
    }

    public void customerSalary(){

        int customerSal = baseSalary + Integer.parseInt("1000");
        System.out.println("Customer Salary" + " : " + customerSal);
    }

    public void employeeSalary(){
        int employeeSal = baseSalary + Integer.parseInt("2000");
        System.out.println("Employee Salary" + " : " + employeeSal);
    }

    public static void main(String[] args)
    {
        //Creating an Object(obj) n object is user defined one
        VariablesTypes1 obj = new VariablesTypes1();
        System.out.println(obj.var1);
        System.out.println(obj.var2);
        System.out.println(obj.var3);
        System.out.println(var6);

        obj.employeeSalary();
        obj.customerSalary();

        obj.methodname();

    }
}
