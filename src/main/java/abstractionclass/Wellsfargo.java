package abstractionclass;

public class Wellsfargo extends Bank {

    int rateOfinterest() {
        return 4;
    }

    @Override
    double rateOfinterest1() {
        return 4.6;
    }

    @Override
    String rateOfinterest2() {
        return "Rate of interest  is high";
    }
}