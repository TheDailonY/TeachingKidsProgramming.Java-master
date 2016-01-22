package codingChallenges;

import java.util.Scanner;

public class convo2
{
  public static String name, feeling, question;
  public static String language, answer_Good, answer_Good1, answer_Good2, Starbucks, coffee;
  public static String answer_Bad, answer_Bad1, answer_Bad2, lunch, goodLunchMaker, friends, nastyLunchMaker,
      friends2, answer_Bad3;
  public static void main(String[] args)
  {
    @SuppressWarnings("resource")
    Scanner keyboared = new Scanner(System.in);
    System.out.println("Please enter you first name.");
    name = keyboared.next();
    System.out.println("It is nice meeting you " + name + ".");
    System.out.println(" How was your day " + name + ".");
    feeling = keyboared.next();
    if (feeling.equals("Good") || feeling.equals("good") || feeling.equals("Well") || feeling.equals("well")
        || feeling.equals("Fine") || feeling.equals("fine") || feeling.equals("Great"))
    {
      System.out.println("Im happy to hear that.");
      System.out.println("Why was your day so good?");
      answer_Good = keyboared.next();
      System.out.println("OHH ok I bet that is why your happy.");
      System.out.println("Am I right?");
      answer_Good = keyboared.next();
      System.out.println("Hahah I knew it.");
      System.out.println("So tell me about yourself " + name + "");
      System.out.println("What do you do in your free time?");
      answer_Good = keyboared.next();
      System.out.println("Thats great. :)");
      System.out.println("I dont really do much myself im really boring......Yup :')");
      System.out.println("Do you drink starbucks?");
      System.out.println("Enter 'Yes' or 'No'");
      Starbucks = keyboared.next();
      if (Starbucks.equals("Yes"))
      {
        System.out.println("Really thats great I like starbucks too.");
        System.out.println("But do you want to knoe a fun fact about coffee.??");
        coffee = keyboared.next();
      }
      else if (Starbucks.equals("No"))
      {
        System.out.println("Everbody has there own opinion. I love startbucks.");
        System.out.println("I guess it is kind of unhealthy if you drink it daily.");
        System.out.println("Do you want to know a fun fact about coffee??");
        coffee = keyboared.next();
      }
      //      if (coffee.equals("Yes")) 
      //      {
      //          System.out.println("Caffeine is the most widely used psychoactive stimulant, targeting the central nervous system and heightening your brain’s feeling of alertness. "
      //                + "According to the FDA, 400 mg per day of caffeine (that’s about four cups of coffee) is a safe amount of caffeine for healthy adults."
      //                + " But too much caffeine—500 to 600 mg—can be dangerous, causing restlessness, tremors, irritability, insomnia and stomach upset.");
      //      }
      //      if (coffee.equals("No")) 
      //      {
      //          System.out.println("Caffeine is the most widely used psychoactive stimulant, targeting the central nervous system and heightening your brain’s feeling of alertness. "
      //                + "According to the FDA, 400 mg per day of caffeine (that’s about four cups of coffee) is a safe amount of caffeine for healthy adults."
      //                + " But too much caffeine—500 to 600 mg—can be dangerous, causing restlessness, tremors, irritability, insomnia and stomach upset.");
      //      }
    }
    if (feeling.equals("Bad"))
    {
      System.out.println("So, your feeling Bad.");
      System.out.println("Why what happened?");
      answer_Bad = keyboared.next();
      System.out.println("OOO!!Sounds like a rough day hit you :'(");
      System.out.println("Am I right?");
      answer_Bad = keyboared.next();
      System.out.println("Well I hope you feel better.");
      answer_Bad = keyboared.next();
      System.out.println("Did you at least enjoy your lunch?");
      lunch = keyboared.next();
      System.out.println("");
      if (lunch.equals("Yes"))
      {
        System.out.println("What did you have?");
        answer_Bad2 = keyboared.next();
        System.out.println("That sounds bomb who made that?");
        goodLunchMaker = keyboared.next();
        System.out.println("Dang can you tell " + goodLunchMaker + " to make something just as great for dinner.");
        System.out.println("Do you have any friends?");
        friends = keyboared.next();
      }
      if (lunch.equals("No") || lunch.equals("no"))
      {
        System.out.println("No, why not.");
        answer_Bad2 = keyboared.next();
        System.out.println("Why what did you eat?");
        answer_Bad2 = keyboared.next();
        System.out.println("Who made it?");
        nastyLunchMaker = keyboared.next();
        //  answer_Bad3 = keyboared.next();
        System.out.println("Well Tell " + nastyLunchMaker + " she can't cook dinner anymore.");
        System.out.println("Do you have any friends?");
        friends = keyboared.next();
        if (friends.equals("Yes") || friends.equals("yes"))
        {
          System.out.println("Did they make your day Better or Worse?");
          friends2 = keyboared.next();
          if (friends2.equals("Better"))
          {
            System.out.println("So how was your day bad?");
            answer_Bad3 = keyboared.next();
          }
          if (friends2.equals("Worse"))
          {
            System.out.println("Well maybe you should get knew friends.");
            answer_Bad3 = keyboared.next();
          }
        }
        if (friends.equals("No"))
        {
          System.out.println("What about me!!!");
          answer_Bad3 = keyboared.next();
          System.out.println(
              "It's ok well now you know you can never say you dont have friends if your computer battery is charged.");
        }
      }
      else
      {
        System.out.println("Learn how to read directions!!!!!!!!!!!!!!");
        System.exit(0);
      }
    }
  }
}