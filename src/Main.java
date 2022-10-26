import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Double itemCost = 0.0;
        boolean done = true;
        Scanner in = new Scanner(System.in);

        itemCost = SafeInput.getRangedDouble(in, "What is the cost of your item?", .50, 9.99);
        done = SafeInput.getYNConfirm(in, "Do you have any other items?");
            System.out.printf("The cost of the item is " + itemCost);
    }
}