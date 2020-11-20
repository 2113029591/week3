import java.util.Scanner;

/**
 * 3.22 几何：点是否在圆内
 */
public class example6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a point with two coordinates:");
        int x=input.nextInt();
        int y=input.nextInt();
        int  x1=0,y1=0,r1=10;
        double r=Math.pow((x-x1)*(x-x1)+(y-y1)*(y-y1),0.5);
    }
}
