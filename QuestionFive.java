public class QuestionFive {
    int isInertial(int[ ] a)
    {

for(int i=0;i<a.length;i++)
{
for(int j = i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
if(a[a.length-1]%2!=0)
{
 
return 0;
}
else
{
boolean encounteredOdd = false; 
for (int k = 0; k < a.length-1; k++) 
{
if(a[k]%2==0 && encounteredOdd==true && a[k]!=a[a.length-1])
{
return 0;
}
if(a[k]%2!=0)
{
encounteredOdd = true;
}
}
if(encounteredOdd==false)
{
return 0;
}
return 1;
}
}

  
    public static void main(String[] args) {

        QuestionFive q = new QuestionFive();
        int[] b = {2, 4, 6, 8, 10};
        System.out.print( q.isInertial(b)+" ");
          
    }
}
