package conditionalclause;

public class IfStatement {

    int age;

    public int method(int voter){

        age = voter;

        if (age >= 18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are a minor,not eligible to vote");
        }

        return age;

    }

    public static void main(String[] args) {
        IfStatement obj = new IfStatement();

        obj.method(17);
        obj.method(18);
        obj.method(27);



    }

}
