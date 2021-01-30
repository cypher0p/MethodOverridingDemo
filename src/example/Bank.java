package example;

public class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    int getRateOfInterest() {
        return 8;
    }
}
class ICICI extends Bank {
    @Override
    int getRateOfInterest() {
        return 7;
    }
}
class AXIS extends Bank {
    @Override
    int getRateOfInterest() {
        return 9;
    }
}