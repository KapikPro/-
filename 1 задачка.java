import java.util.Scanner;
public class program
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n=in.nextInt();
        if(n>0)
        for(int i=0;i<n;i++)
         System.out.println(str);
        else
            System.out.print(str);
        in.close();
    }
}
