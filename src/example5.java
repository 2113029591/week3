import java.util.Scanner;

/**
 * 3.21 科学：某天是星期几
 */
public class example5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year,month,day;
        System.out.print("Enter year:");
        year=input.nextInt();
        System.out.print("Enter month:");
        month=input.nextInt();
        System.out.print("Enter the day of the month:");
        day=input.nextInt();
        int k=year%100;
        int j=year/100;
        int h=0;
        if(month==1 ||month==2)
        {
            month=month+12;
            if(k==0)
            {
                k=99;
                j=j-1;
            }
            else
                k=k-1;
            h=(day+(int)26*(month+1)/10+k+(int)k/4+(int)j/4+5*j)%7;
        }
        if(h==0){
            System.out.println("Saturday");
        }
        else if(h==1){
            System.out.println("Sunday");
            }
        else if(h==2){
            System.out.println("Monday");
        }
        else if(h==3){
            System.out.println("Tuesday");
        }
        else if(h==4){
            System.out.println("Wednesday");
        }
        else if(h==5){
            System.out.println("Thursday");
        }
        else if(h==6){
            System.out.println("Friday");
        }
    }
}
