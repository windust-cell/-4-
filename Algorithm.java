import static jdk.nashorn.internal.objects.NativeMath.round;
import static jdk.nashorn.internal.runtime.ScriptObject.setGlobalObjectProto;

public class Algorithm {
    private int a;
    private String str1,str2;
    private double i,j,k;
    public static double round(double num,int scale){
        return Math.round(num*Math.pow(10.0,scale))/Math.pow(10.0,scale);
    }
    public void change(String str,int a){
        try{
            str1=str.substring(0,a);
            str2=str.substring(a+1);
            i=Double.parseDouble(str1);
            j=Double.parseDouble(str2);
        }catch (NumberFormatException e){
            System.out.println("来，骗，来，乱输，我这个计算器的好代码，这好吗？这不好");
            System.exit(0);
        }
    }
    public void add(String str){
        a=str.indexOf("+");
        change(str,a);
        k=round(i+j,3);
        System.out.println(k);
    }
    public void subtract(String str){
        a=str.indexOf("-");
        change(str,a);
        k=round(i-j,3);
        System.out.println(k);
    }
    public void multiply(String str){
        a=str.indexOf("*");
        change(str,a);
        k=round(i*j,3);
        System.out.println(k);
    }
    public void divide(String str){
        a=str.indexOf("/");
        change(str,a);
        if(j==0){
            try {
                throw new MyException("异常");
            }catch (Exception e){
                System.out.println("不要搞，窝里斗，不要搞，除以0");
                System.exit(0);
            }
        }
        k=round(k,3);
        System.out.println(k);
    }
}
