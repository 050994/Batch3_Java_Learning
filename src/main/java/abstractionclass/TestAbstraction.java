package abstractionclass;


public class TestAbstraction {
    public static void main(String[] args) {

        Bank bank = new Bofa();
        System.out.println("My Rate of interest in Bofa is = " + bank.rateOfinterest() +"%");
        System.out.println(bank.rateOfinterest1());
        System.out.println(bank.rateOfinterest2());

        Bank bank1 = new Chase();
        System.out.println("My Rate of interest in Chase is = " + bank1.rateOfinterest() +"%");
        System.out.println(bank1.rateOfinterest1());
        System.out.println(bank1.rateOfinterest2());


        Bank bank2 = new Wellsfargo();
        System.out.println("My Rate of interest in Wellsfargo is = " + bank2.rateOfinterest() +"%");
        System.out.println(bank2.rateOfinterest1());
        System.out.println(bank2.rateOfinterest2());


        Bank bank3 = new Dcu();
        System.out.println("My Rate of interest in Dcu is = " + bank3.rateOfinterest() +"%");
        System.out.println(bank3.rateOfinterest1());
        System.out.println(bank3.rateOfinterest2());
    }
}