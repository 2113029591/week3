import java.util.Scanner;

/**
 * 3.28两个矩形
 */
public class example10 {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter r1's center x-,y-cooordinates, width,and height:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        System.out.print("Enter r2's center x-,y-coordinates, width,and height:");

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 =input.nextDouble();

        double xDistance =0;
        double yDistance =0;
        if(x1 -x2 >=0){
            xDistance=x1 -x2;
        }
        else{
            xDistance=x2 -x1;
        }
        if(y1-y2 >=0){
            yDistance=y1-y2;
        }
        else{
            yDistance=y2-y1;
        }

        if (xDistance <= (w1 - w2) / 2 && yDistance <= (h1 - h2) / 2){
            System.out.println("r2 is inside r1");
        }
        else if (xDistance <= (w1 + w2) / 2 && yDistance <= (h1 + h2) / 2)
        {
            System.out.println("r2 overlaps r1");
        }
        else {System.out.println("r2 does not overlap r1");}
    }
}
