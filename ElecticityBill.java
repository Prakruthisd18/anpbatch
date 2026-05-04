package day8;

public class ElecticityBill {

    public static void main(String[] args) {
        int units = 180;
        double bill;

        if (units <= 100) {
            bill = units * 1.50;
        } 
        else if (units <= 200) {
            bill = (100 * 1.50) + ((units - 100) * 2.50);
        } 
        else {
            bill = (100 * 1.50) + (100 * 2.50) + ((units - 200) * 4);
        }

        System.out.println("Output: " + bill);
    }
}