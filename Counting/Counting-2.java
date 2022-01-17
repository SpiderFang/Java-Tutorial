import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

    int Money = 1000;

    Scanner inputReader = new Scanner (System.in);

    //Step1+Step2
    System.out.println ("Enter 5 numbers (0~999): ");

    int counter = 0;
    int totalValues = 0;
    while (counter < 5) {
        //System.out.println("counter: "+counter);
	    int number = inputReader.nextInt ();
	    System.out.println ("Your entered number was: " + number);
	    //Check input number between 0~999
	    if (number>=0 && number<=999) {
	        counter += 1;
	        totalValues = totalValues + number;
	        System.out.println ("Total: " + totalValues);
	    }
	    else {
	        System.out.println("Invalid input! Input number between 0~999 again.");
	    }
	  
    }
    int residual = Money - totalValues;
    System.out.println ("Residual: " + residual);

    //Step3+Step4
    if (residual >= 0) { //在結果前面加正號and補0
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
