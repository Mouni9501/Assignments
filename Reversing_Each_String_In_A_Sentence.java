public class Reversing_Each_String_In_A_Sentence
{
    public static void main(String args[])
    {
        String input = "Argentina won the world cup";
        String[] splited = input.split(" ");
//        String rev = "";
//        System.out.println(splited.length);
       // System.out.println(splited[0]);
        for(int i=0;i<splited.length;i++)
        {
            String str = splited[i];
           String rev = reverse(str);
            System.out.print(rev +" ");
//           char[] ch = str.toCharArray();
//           for(int j=ch.length-1;j>=0;j--)
//           {
//               System.out.print(ch[j]);
//           }
//            System.out.print(" ");
        }
    }
    public static String reverse(String str)
    {
     String reverse = "";
     for(int i=str.length()-1;i>=0;i--)
     {
         reverse =reverse+str.charAt(i);
     }
     return reverse;

    }

}
