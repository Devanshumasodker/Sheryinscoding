import java.util.Scanner;

public class Palindrome_number {

    public static void main(String[] args) {
//int []a = {1,1,2,1}; we can also take the array as an input from user
        Scanner s = new Scanner(System.in);
        System.out.println("give the size of array");
        int size = s.nextInt();
        int []a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }

        System.out.println(pall(a));
    }
    public static boolean pall ( int []num){
      //  int []num = {1,2,1};
        int l = num.length-1;
        for (int i = 0; i <=  num.length/2; i++) {
            if (num[i]!=num[l--]) return false;
        }
        return true;

    }
    public static boolean pallindrome (int []a){
        int []temp = new int[a.length];
        for (int i = a.length-1; i >= 0; i--) {
            temp[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=temp[i]) return false;
        }
        return false;
    }


}
