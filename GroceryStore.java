package day8;

public class GroceryStore {

    public static void main(String[] args) {

        String itemName = "Rice";
        int quantity = 10;
        float pricePerUnit = 70;
        int isMember = 1;

        double subtotal = quantity * pricePerUnit;

        
        double discount = 0.0;
        double afterDiscount = subtotal;

       
        if (isMember == 1) {
            discount = subtotal * 0.10;
            afterDiscount = subtotal - discount;
        }

        
        double gstRate;
        if (afterDiscount > 500) {
            gstRate = 0.05;
        } else {
            gstRate = 0.12;
        }

        double gstAmount = afterDiscount * gstRate;
        double finalTotal = afterDiscount + gstAmount;

        
        System.out.println("Item Name: " + itemName);
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("GST Amount: %.2f\n", gstAmount);
        System.out.printf("Final Total: %.2f\n", finalTotal);
    }
}