import java.util.Scanner;
//10- Take 3 int inputs from user and check and print the result.
//	all are equal
//	any of two are equal
public class Q10_ifelse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write 3 input and we tell all are equal or any 2 of them is equal");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a==b&&b==c&&c==a) System.out.println("all are equal");
        else if (a==b||b==c||c==a) System.out.println("any two of them are equal");
        else System.out.println("all are different");
    }
}
