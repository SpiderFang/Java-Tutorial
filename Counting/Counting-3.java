import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("+1000");
    
    int total = 1000;
    int cost = 0;
    for (int i = 0; i < 5; i++) {
	    int a = sc.nextInt ();
	    System.out.printf("-%04d\n", a);
	    cost += a; //計算總支出
    }
    
    System.out.println ("-----");

    int result = total - cost; //結餘
    if (result > 0)
      {
	System.out.printf("+%04d", result);
      }
    else
      {
	result *= -1;
	System.out.printf("-%04d", result);
      }

  }
}
