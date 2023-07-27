public class FibanocciSeries {
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        fibanocciSeries(a,b);

    }
    static void fibanocciSeries(int x,int y)
    {
        int i=0;
        while(i<10)
        {
            int sum = x+y;
            System.out.print(sum+" ");
            x=y;
            y=sum;
            i++;
        }
    }
}
