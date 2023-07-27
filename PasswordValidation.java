public class PasswordValidation {
    public static void main(String args[])
    {
       String password = "Mounika";
       passwordChecking(password);
    }
    static void passwordChecking(String password)
    {
        boolean result = false;
        int length = password.length();
        System.out.println(length);
       for(int i=0;i<length;i++)
       {
       if(length>8 &&
       Integer.valueOf(password.charAt(i))>=65 && Integer.valueOf(password.charAt(i))<=90
       && Integer.valueOf(password.charAt(i))>=97 && Integer.valueOf(password.charAt(i))<=122)
        {
          result = true;
        }
        }
       if(result == true)
       {
           System.out.println("password met the criteria");
       }
       else
       {
           System.out.println("password didn't meet the criteria");
       }
    }
}
