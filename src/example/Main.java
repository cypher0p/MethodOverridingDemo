package example;

public class Main {
    public static void main(String[] args) {
        AXIS axis = new AXIS();
        ICICI icici = new ICICI();
        SBI sbi = new SBI();

        System.out.println("SBI rate of interest = " + sbi.getRateOfInterest());
        System.out.println("ICICI rate of interest = " + icici.getRateOfInterest());
        System.out.println("AXIS rate of interest = " + axis.getRateOfInterest());

        System.out.println("new =   " + axis.getClass());
    }
}
