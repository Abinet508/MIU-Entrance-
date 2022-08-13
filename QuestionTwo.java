import java.util.ArrayList;
public class QuestionTwo {
    
    int nUpCount(int[]a, int n)
    {
    int count = 0;
    int sum=0;
    int previousSum=0;

    ArrayList<Integer> clone = new ArrayList<Integer>(a.length); // create a clone of the array it not necessary but it is a good practice
    
    for(int i = 0; i < a.length; i++)
    {
        clone.add(a[i]);
    }
    
    for(int i = 0; i < clone.size(); i++)
    {   
        sum+=clone.get(i);
        if(sum >= n && previousSum==0)
        {
            count++;
        }
       else if(sum > n && previousSum<=n )
        {
            count++;
        }
        previousSum=sum;
    }
    return count;
    }

    public static void main(String[] args) 
     {
        QuestionTwo q2 = new QuestionTwo();
        int[] UpCount={2,3,1,-6,8,-3,-1,2};    
         System.out.println(q2.nUpCount(UpCount,5));
     }
        
     }
