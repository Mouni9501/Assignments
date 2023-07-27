public class MultiplicationOfTwoNumbersWithoutUsingMultiplyOperator {
    public static void main(String args[])
    {
        int a = 3;
        int b =42;
      int output =  multiply(a,b);
        System.out.println(output);
    }
  static int multiply(int firstNumber, int secondNumber)
  {
      int random =1;
      int result =0;
      while (random<=secondNumber)
      {
         result = result+firstNumber;
         random++;
      }
      return result;
  }
}
