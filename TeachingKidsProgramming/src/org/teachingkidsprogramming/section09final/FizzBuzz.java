package org.teachingkidsprogramming.section09final;

public class FizzBuzz
{
  public static void main(String[] args)
  {
    int divisor1 = 3;
    int divisor2 = 5;
    for (int i = 1; i < 100; i++)
    {
      if (i % divisor1 == 0 && i % divisor2 == 0)
      {
        System.out.println("FizzBuzz");
      }
      else if (i % divisor1 == 0)
      {
        System.out.println("Fizz");
      }
      else if (i % divisor2 == 0)
      {
        System.out.println("Buzz");
      }
      else
      {
        System.out.println(i);
      }
    }
    //
    //    NOTE: this is a kata (higher level instructions)
    //    part of the exercise is to translate into line-by-line English, THEN Java
    //
    //    For more complete directions see this page
    //    https://www.penflip.com/lynnlangit/tkp-lesson-plans/blob/master/course09.txt
  }
}
