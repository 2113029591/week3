import java.util.Scanner;

/**
 * 3.19 计算三角形的周长
 */
public class example4 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a+b>c&&a+c>b&&b+c>a)
        {
            System.out.println(a+b+c);
        }
        else
        {
            System.out.println("输入值不能组成三角形");
        }
    }
}
