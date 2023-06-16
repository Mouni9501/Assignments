import java.util.Arrays;

public class SumOfTwoNumAndTheirIndexes
{
    public static void main(String args[])
    {
         int input[] = {2,7,11,15,45,19,54};
         int target =  13;
         int inputLength = input.length;
         int index = 0;
         int output[] = new int[2];
         for(int i=0;i<inputLength;i++)
         {
             for(int j=i+1;j<inputLength;j++)
             {
                 int a = input[i];
                 int b = input[j];
                 int c = a+b;
                 if(c==target)
                 {
                     output[index] = i;
                     output[index+1] = j;
                     System.out.println(Arrays.toString(output));
                     break;
                 }
             }

         }
    }
}

// i = 0 ; j =1 --> input[0] =2 input[1] =7 2+7 c=9 c!=target
// i = 0 ; j =2 --> input[0] =2 input[2] =11 2+11 c!=target
// i = 0 ; j =3 --> input[0] =2 input[3] =15 2+15 c=target
//break
//output[] = [0,3]  -->output[0] = i;
//                     output[1] = j
//99 not getting o/p
