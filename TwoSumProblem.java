import java.util.HashMap;
import java.util.Map;
public class TwoSumProblem
{
    public static void main(String args[])
    {
        int input[] = {2,7,11,15,45,19,54};
        int target =  9;
//there is only single solution
                //{2:0,7:1,11:2,15:3,45:4,19:5,54:6 }
        //target =99, t=0
       // t=target-2 = 97
        //t=target-7 = 92
        //t = target-45 = 54// i=4
        Map<Integer, Integer> mp = new HashMap<>();
        int compliment=0;
        for(int i=0;i<input.length;i++)
        {
           compliment = target-input[i];
           if(mp.containsKey(compliment))
           {
               System.out.println(mp.get(compliment)+" "+ i);
           }
else
            mp.put(input[i], i);
        }
    }
}
