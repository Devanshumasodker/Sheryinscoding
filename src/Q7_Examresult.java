import java.util.Scanner;

public class Q7_Examresult {
    public static void main(String[] args) {
        System.out.println("hello dear");
        System.out.println("enter marks obtained in maths");
        Scanner sc = new Scanner(System.in);
        double maths = sc.nextInt();
        // why we take double instead of int ?
        // because java's rule is that if we divide int with int so it gives int

        System.out.println("enter marks obtained in english");
        double Eng = sc.nextInt();
        System.out.println("enter marks obtained in science");
       double sci = sc.nextInt();

       double avg = (maths+sci+Eng)/3.0;// the average is the total subjects marks divided by the number of subjects

       double result = (avg/100)*100;

        System.out.println("you scored the "+ result +" % ");
    }
}
