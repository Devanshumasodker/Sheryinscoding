import java.util.Scanner;

public class Evenodd_bitman {
    public static void main(String[] args) {
        System.out.println("Enter a number and we check its even or odd");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // here we are using and operator
        // 1110 1111 ( this is the binary representation of 14 and we perform & operation with 1
        // so if msb bit is one so it is odd otherwise even
        System.out.println("Sustam and aha the");
        System.out.println( (a&1)==1 ? "odd" : "even");
    }
}
