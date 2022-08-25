public class QuestionSix 
{
 
     /* 
    You may assume that there exists a function named isPerfectSquare
    that returns 1 if its argument is a perfect square and 0 otherwise. 
    E.G., isPerfectSquare(4) returns 1 and isPerfectSquare(8) returns 0.
   
   */ 
    public static int isPerfectSquare(int y)
    {
        int multiplier=1;
            
        while(multiplier<=y)
        {
        int square=1;
        square=multiplier*multiplier;
        if(square==y)
        {
            return 1;
        }
        multiplier++;
        }
        return 0;
    }
   // no need to write the above function 

    int countSquarePairs(int[ ] a)
    {
        int count =0;
        if (a.length<2)// saves time 
        {
            return 0;
        }
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++)
            {
                if(a[i]<a[j] && i!=j && a[i]>0 && a[j]>0)
                {
                    int sum=a[i]+a[j];
                    if(isPerfectSquare(sum)==1)
                    {
                        count++;
                    }
                    
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        QuestionSix q6 = new QuestionSix();
        int[] a = {3};
        System.out.println(q6.countSquarePairs(a));
    }
}



