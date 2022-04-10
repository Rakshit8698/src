import java.util.Scanner;
public class factors5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        int a=sc.nextInt();
        for (i =1;i<=a;i++){
            if (a%i==0)
                System.out.println(i);

        }
    }
}
