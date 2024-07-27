package Abstaract;

abstract class BankP {
    abstract int getRateOfInterest();
}

class SBI extends BankP {
    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends BankP {
    int getRateOfInterest() {
        return 8;
    }
}

class Bank {
    public static void main(String args[]) {
        BankP b;
        b = new SBI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        b = new PNB();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
    }
}
