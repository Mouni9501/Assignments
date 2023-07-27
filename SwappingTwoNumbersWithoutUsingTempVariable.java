public class SwappingTwoNumbersWithoutUsingTempVariable {
    public static void main(String args[])
    {
        int a= 90;
        int b= 54;
        swappingTwoNumbersWithoutUsingTempVariable(a,b);
    }
    static void swappingTwoNumbersWithoutUsingTempVariable(int a, int b)
    {
         a= a+b;
         b= a-b;
         a =a-b;
        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b);
    }
}
