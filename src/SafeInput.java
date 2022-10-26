import java.util.Scanner;

public class SafeInput
{
    public static Double getRangedDouble(Scanner pipe, String prompt, Double low, Double high) {
    Double retVal = 0.0;
    String trash = "";
    boolean done = false;

    do {
        System.out.print("\n" + prompt + "[ " + low + "-" + high + "]: ");
        if (pipe.hasNextDouble()) {
            retVal = pipe.nextDouble();
            pipe.nextLine();
            if (retVal >= low && retVal <= high) {
                done = true;
            } else {
                System.out.println("\nNumber is out of range [ " + low + "- " + high + "]: " + retVal);
            }
        } else {
            trash = pipe.nextLine();
            System.out.println("You must enter a double: " + trash);
        }
    } while (!done);

    return retVal;
}
    public static boolean getYNConfirm(Scanner pipe, String prompt)

    {
        boolean retVal = true;
        String response = "";
        boolean gotVal = false;

        do
        {
            System.out.print("\n" + prompt + "[Y/N]");
            response = pipe.nextLine();
            if(response.equalsIgnoreCase("Y"))
            {
                gotVal = true;
                retVal = true;
            }
            else if(response.equalsIgnoreCase("N"))
            {
                gotVal = true;
                retVal = false;
            }
            else
            {
                System.out.println("You must enter [Y/N] " + response);
            }
        }while(!gotVal);

        return retVal;
    }

}
