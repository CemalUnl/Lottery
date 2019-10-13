package lab1;


import lab1.LotteryNumberGenerator;
import java.io.IOException;
import java.util.Set;



public class PlayLottery 
{

 
  
  public void setupLottery() throws IOException
  {
    LotteryNumberGenerator generator = new LotteryNumberGenerator();
    LotteryNumberPicker picker = new LotteryNumberPicker();
    Set<Integer> generatedLotteryNumbers = generator.generateLotteryNumbers();
    Set<Integer> userLotteryNumbers = picker.promptUserForLotteryNumbers();
    
    System.out.print("Here are the lottery numbers: ");
    for (Integer generatedNumber : generatedLotteryNumbers)
    {
      System.out.print(generatedNumber + " ");
    }
    System.out.println();
    
    Set<Integer> matchedNumbers = playLottery(generatedLotteryNumbers, userLotteryNumbers);
    System.out.println("You matched " + matchedNumbers.size() + " number(s)");
    if (matchedNumbers.size() > 0)
    {
      System.out.print("Your matched numbers were: ");
      for (Integer matchedNumber : matchedNumbers)
      {
        System.out.print(matchedNumber + " ");
      }
    }
  }
  

  public Set<Integer> playLottery (Set<Integer> lotteryNumbers, Set<Integer> userNumbers)
  {
    return null;
  }
}
