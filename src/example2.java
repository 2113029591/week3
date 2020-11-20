import java.util.Scanner;

/**
 * 3.9  商业：检查ISBN-10
 */
public class example2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        System.out.print("The ISBN-10 number is "+str);
        int i=0,total=0;
        for(i=0;i<str.length();i++)
        {
            total+=((int)str.charAt(i)-48)*(i+1);
        }
        total=total%11;

        if(total==10){System.out.println("X");}
        else{System.out.println(total);}
    }
}
