public class QuestionThree {
    int primeCount(int start, int end) 
    {
        if(start<0)
        {
            start=1;
        }
        if(end<0|| end<start)
        {
            return 0;
        }
        int count = 0;
        boolean flag;
        for (int i = start; i <= end; i++) 
        {
            flag = false;
            if(i==1)
            {
                continue;
            }
            else if (i==2) 
            {
                count=count+1;
            }
            else
            {
                for (int j = 2; j < i; j++) 
                {
                    if (i % j == 0) 
                    {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) 
                {
                    count=count+1;
                }
           
            }
        }
        return count;
    }

    public static void main(String[] args) {
        QuestionThree q3 = new QuestionThree();
        System.out.println(q3.primeCount(1, 3));
    }
}
