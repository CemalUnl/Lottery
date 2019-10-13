package lab1;

import java.util.Set;
import java.util.HashSet;
import java.util.Random;



public class LotteryNumberGenerator 
{

  public Set<Integer> generateLotteryNumbers ()
  {
   Set<Integer> numbers = new HashSet<Integer>(6);
    Random random = new Random();
    
    for (int i=0; i<6; i++)
      while (!numbers.add(random.nextInt(49) + 1));
    
    return numbers;
  }
}
