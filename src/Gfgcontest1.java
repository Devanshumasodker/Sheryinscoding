public class Gfgcontest1 {
    public static void main(String[] args) {
        int n= 5, curr=0,c=0;
        for (int i = 1; i <= n ; i=i*2)
        {
            // 1,2,4,8,
            if( i > curr) {

                curr++;
            }
            c++;
        }
        System.out.println(c);

    }
}
