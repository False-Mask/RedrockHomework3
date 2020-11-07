package Redrock3.Level2;
import java.util.Scanner;
public class Level2 {
    public static void main(String[] args) {
        System.out.println("请输入需要计算的类型（本系统只支持+-*/运算 格式如：1+1）");
        Scanner Sc=new Scanner(System.in);
        double x=Sc.nextDouble();
        char op=Sc.next().charAt(0);
        double y=Sc.nextDouble();
        calculate cal;
        cal=new Finish();
        double answer=cal.Calculate(x,op,y);
        System.out.println(x+" "+op+" "+y+" ="+answer);
    }
}
