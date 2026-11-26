
import  java.util.List ;​​​​

public  class  Solution8 {

    // Практическое заполнение Java №1 (LeetCode 485. Max Consecutive Ones)
    public  int  findMaxConsecutiveOnes ( int [] nums ) {
        int  maxCount = 0 ;
        int  currentCount = 0 ;
        
        for ( int  num : nums ) {
            если ( num == 1 ) {
                currentCount ++;
                if ( currentCount > maxCount ) {
                    maxCount = currentCount ;
                }
            } еще {
                currentCount = 0 ;
            }
        }
        
        return  maxCount ;
    }
