import java.util.Scanner;

/**
 * 3.23点是否在矩形内
 */
public class example7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入十bai字坐标系中du的一个点zhi，例如dao 4 5 ：");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double distance = Math.pow((x * x + y * y) , 0.5);
        if (distance <= 10) {
            System.out.println("点" + "(" + x + "," + y + ")" + " 在圆内答");
        }
        else{
            System.out.println("点" + "(" + x + "," + y + ")" + " 不在圆内");
        }
    }
}
