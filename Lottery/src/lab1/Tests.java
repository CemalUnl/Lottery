package lab1;

import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.Test;


public class Tests {

  
  @Test
  public void should_return_a_set_of_6_numbers_with_no_duplicates ()
  {
    LotteryNumberGenerator sut = new LotteryNumberGenerator();
    
    Set<Integer> lotteryNumbers = sut.generateLotteryNumbers();
    assertEquals(lotteryNumbers.size(),6);
    
  }
  
  @Test
  public void generated_numbers_must_be_between_1_and_49 ()
  {
    LotteryNumberGenerator sut = new LotteryNumberGenerator();
    
    int lowest=49;
    int highest=1;
    
    for (int i=0; i<100000; i++)
    {
      Set<Integer> lotteryNumbers = sut.generateLotteryNumbers();
      for (Integer num : lotteryNumbers)
      {
        if (num < lowest)
        {
          lowest = num;
        }
        if (num > highest)
        {
          highest = num;
        }
      }
    }
    assertEquals(highest,49);
    assertEquals(lowest,1);
    
    
  }
  
  @Test
  public void should_match_numbers_properly ()
  {
    PlayLottery lottery = new PlayLottery();
    Set<Integer> lotteryNumbers = new HashSet<Integer>(6);
    Set<Integer> userNumbers = new HashSet<Integer>(6);
    
    lotteryNumbers.add(1);lotteryNumbers.add(6);lotteryNumbers.add(8);lotteryNumbers.add(24);lotteryNumbers.add(35);lotteryNumbers.add(49);
    userNumbers.add(2);userNumbers.add(4);userNumbers.add(24);userNumbers.add(34);userNumbers.add(35);userNumbers.add(45);
    Set<Integer> matchedNumbers = lottery.playLottery(lotteryNumbers, userNumbers);
    
     assertEquals(matchedNumbers.size(),2);
     assertTrue(matchedNumbers.contains(24));
    assertTrue(matchedNumbers.contains(35));
    
        
  }
}
