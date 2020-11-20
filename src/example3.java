import java.util.Scanner;

/**
 * 3.15 游戏：彩票
 */
public class example3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int number1=number;
        int lotteryTicket=(int)(Math.random()*(999-100)+100);
        int lottery=lotteryTicket;
        System.out.println("彩票号码为："+lotteryTicket);
        System.out.print("可获得的奖金为：");
        int[] a=new int[10];
        int[] b=new int[10];
        int i=0;
        for(i=0;i<3;i++)
        {
            int s=lotteryTicket%10;
            a[s]=1;
            lotteryTicket=lotteryTicket/10;
        }
        for(i=0;i<3;i++)
        {
            int s=number%10;
            b[s]=1;
            number=number/10;
        }
        int total=0;
        for(i=0;i<10;i++)
        {
            if(a[i]==b[i]&&a[i]==1){total+=1;}
        }
        if(number1==lottery)
        {
            System.out.println(10000+"美金");
        }
        else if(total==3)
        {
            System.out.println(3000+"美金");
        }
        else if(total>=1){
            System.out.println(1000+"美金");
        }
        else{
            System.out.println(0+"美金");
        }
    }
}
