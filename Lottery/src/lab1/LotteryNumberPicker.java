package lab1;


import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class LotteryNumberPicker 
{

 
  public Set<Integer> promptUserForLotteryNumbers () throws IOException
  {
    Scanner in = new Scanner(System.in);
    Set<Integer> selectedNumbers = new HashSet<Integer>(6);
    
    try
    {
      for (int i=0; i<6; i++)
      {
        System.out.print("Please select a lottery number (between 1 and 49): ");
        getInput(in, selectedNumbers, false);
      }
    }
    finally
    {
      in.close();
    }
    return selectedNumbers;
  }
  
  private int getInput(Scanner in, Set<Integer> selectedNumbers, boolean validateOnly) {
    int num = 0;
    while (num == 0)
    {
      num = in.nextInt();
      num = validateInput(num);
      if (num == 0)
        continue;
      if (!validateOnly)
      {
        while (!selectedNumbers.add(num))
        {
          System.out.print("You've already selected that number, try again: ");
          num = getInput(in, selectedNumbers, true); 
        }
      }
    }
    return num;
  }

  private int validateInput(int num) {
    if (num < 1 || num > 49)
    {
      System.out.println("That is not a valid number.");
      System.out.print("Please select a lottery number (between 1 and 49): ");
      num = 0;
    }
    return num;
  }
  
  
}
