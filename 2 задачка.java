import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n_1 = in.nextInt();
        int n_2 = in.nextInt();
        int x =n_2*n_1;
        if(n_1>=0 && n_2>=0)
            for (int i=1;i<17;i++)
                System.out.printf("к %d неделе будет выпито %d литров жидкости\n",i,x*i);
        else
        {
            System.out.println("пей больше пива");
            System.exit(0);
        }
        if(x*16>=120)
         System.out.println("Студент принят в IT-клуб");
        else
            System.out.println("Студент не принят в IT-клуб");
    }
}