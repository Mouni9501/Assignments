
public class Arranging_Strings_In_Sequence_Order
{
    public static void main(String args[])
    {
        String input = "very4 girl6 Mounika1 is2 a3 good5";
        //A-Z =65 - 90
        //a-z=97-122
        //0-9=48-57
        String[] afterSplitting = input.split(" ");
        String[] output = new String[afterSplitting.length+1];
        String s="";
        for(int i=0;i<input.length();i++)
        {
            if(!(Integer.valueOf(input.charAt(i))>=48 &&Integer.valueOf( input.charAt(i))<=57))
            s=s+input.charAt(i);//Programming4

             if(Integer.valueOf(input.charAt(i))>=48 &&Integer.valueOf( input.charAt(i))<=57)
            {
                output[Integer.valueOf(input.charAt(i))-48] = s.trim();
                s="";
            }
        }
        for(String ab:output)
       {
           if(ab!= null)
          System.out.print(ab+" ");

      }


//        String[] afterSplitting = input.split(" ");
//        String[] output = new String[afterSplitting.length+1];
//        for(int i=0;i< afterSplitting.length;i++)
//        {
//           String str = afterSplitting[i];
//           int length = str.length();
//           char c = str.charAt(length-1);
//           int a = Character.getNumericValue(c);
//           output[a] = str;
//
//        }
//        for(String ab:output)
//        {
//            if(ab!= null)
//            System.out.print(ab+" ");
//        }
    }
}
