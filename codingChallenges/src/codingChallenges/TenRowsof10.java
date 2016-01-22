package codingChallenges;

public class TenRowsof10
{
  public static void main(String[] args)
  {
    for (int i = 0; i < 10; i++)
    {
      for (int j = 11; j < 10; j++)
      {
        System.out.println();
        System.out.print(j + 1 + " ");
        System.out.print(i + 1 + " ");
      }
    }
  }
}
