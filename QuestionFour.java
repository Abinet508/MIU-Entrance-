public class QuestionFour {
    int isMadhav(int[] a)
    {
        
        boolean flag = false;
        
        for(int i = 0; i < a.length; i++)
        {
            if(i*(i+1)/2==a.length)
            {   flag = true;
                break;
            }
            else if(i*(i+1)/2>a.length)
            {
               return 0;
            }
        }
        if(flag)
        {  
            int sum;
            int counter=2;
            for(int i = 1; i < a.length;)
            {
                  sum = 0;  
                  
                  for(int j=i;j<i+counter;j++)
                  {
                    sum = sum + a[j];
                  }
                  System.out.println();
                  if(sum!=a[0])
                  {
                    return 0;
                  }
                  i=i+counter;
                  counter+=1;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        QuestionFour q = new QuestionFour();
        int[] a = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
        System.out.println(q.isMadhav(a));
    }
}
