public class QuestionOne {
    
    int nextPerfectSquare(int n) 
    {
         int i = 1;
         while (i * i <= n)
         {
             i++;
         }
         return i * i;
     }
 
     public static void main(String[] args) 
     {
         QuestionOne q1 = new QuestionOne();    
         System.out.println(q1.nextPerfectSquare(16));
     }
        
     
    }