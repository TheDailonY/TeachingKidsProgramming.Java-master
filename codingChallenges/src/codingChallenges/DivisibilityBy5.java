package codingChallenges;

import java.util.Scanner;

public class DivisibilityBy5
{
  public static void main(String[] args)
  {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number greater than 0.");
    long num = sc.nextInt();
    if (num < 1)
    {
      System.out.println("Please follow directions.");
      System.exit(0);
    }
    long divisor = 2;
    if (num % divisor == 0)
    {
      System.out.println("Yes!");
    }
    else
    {
      System.out.println("Nope!");
    }
  }
}
