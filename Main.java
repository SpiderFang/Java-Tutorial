import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

    int Money = 1000;

    Scanner inputReader = new Scanner (System.in);

    //Step1+Step2
    System.out.println ("Enter 5 numbers (0~999): ");

    int totalValues = 0;
    for (int i = 0; i < 5; i++) {
	    int number = inputReader.nextInt ();
	    System.out.println ("Your entered number was: " + number);
	    totalValues = totalValues + number;
	    System.out.println ("Total: " + totalValues);
    }
    int residual = Money - totalValues;
    System.out.println ("Residual: " + residual);

    //Step3+Step4
    if (residual >= 0) {
	    //System.out.println(String.format("%+05d", +residual));
	    System.out.println ("Formatted residual: " +
			    String.format ("%+05d", +residual));
    }
    else {
	    //System.out.println(String.format("%05d", +residual));
	    System.out.println ("Formatted residual: " +
			    String.format ("%05d", +residual));
    }
  }

}
