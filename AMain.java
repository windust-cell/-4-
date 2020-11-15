import java.util.Scanner;

public class AMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Couple couple=new Couple();
        int num= sc.nextInt();
        couple.count(num);
        int num1=sc.nextInt();
        couple.fb(num1);
        int num2=sc.nextInt();
        couple.factorial(num2);
    }
}
