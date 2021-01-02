import java.util.Scanner;

/**
 * 3.23点是否在矩形内
 */
public class example7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates:");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if(x>-5 &&x<5 &&y>-2.5&&y<2.5){
            System.out.println("point is in the rectangle");
        }
        else{
            System.out.println("point is not in the rectangle");
        }
    }
}
