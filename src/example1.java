import java.util.Scanner;
/**
 * 随机月份
 */
public class example1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=(int)(Math.random()*(12-1)+1);
        String[] str=new String[]{"0","January","January",
        "March","April","May","June","July","August",
                "September","October","November","December"};
        System.out.println(number+" "+str[number]);
    }
}
