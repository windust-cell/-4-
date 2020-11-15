public class Couple {
    public void count(int num0){
        int all=0;
        for (int i = 0; i < num0; i++) {
            all=all+i;
        }
        System.out.println(all);
    }
    public void fb(int num1){
        int a[]=new int[num1];
        a[0]=1;
        a[1]=1;
        for (int i = 2; i < num1; i++) {
            a[i]=a[i-1]+a[i-2];
        }
        System.out.println(a[num1-1]);
    }
    public void factorial(int num2){
        int all=1;
        for (int i = 1; i <= num2; i++) {
            all=all*i;
        }
        System.out.println(all);
    }
}
