package abstractionclass;

public class Dcu extends Bank {

    int rateOfinterest() {
        return 5;
    }

    @Override
    double rateOfinterest1() {
        return 5.8;
    }

    @Override
    String rateOfinterest2() {
        return "Rate of interest is very high";
    }
}