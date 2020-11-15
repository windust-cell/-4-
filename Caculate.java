import java.util.Scanner;

public class Caculate {
    public static void main(String[] args) {
        Algorithm algorithm=new Algorithm();
        String str,s1,s2;
        int a;
        String s[]={"+","-","*","/"};
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        for (int i = 0; i < 4; i++) {
            a=str.indexOf(s[i]);
            if(a!=-1){
                switch (i) {
                    case 0:{
                        algorithm.add(str);
                        break;
                    }
                    case 1:{
                        algorithm.subtract(str);
                        break;
                    }
                    case 2:{
                        algorithm.multiply(str);
                        break;
                    }
                    case 3:{
                        algorithm.divide(str);
                        break;
                    }
                }
            }
            if(a==-1&i==3){
                System.out.println("年轻人你不讲器德，希望你耗子尾汁，好好输入运算符");
            }
        }
    }
}
