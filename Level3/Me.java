package Redrock3.Level3;
import java.util.Scanner;
import java.util.Random;
public class Me implements BackMe{
    int id;
    String name,addr;
    static int count=1;
    public Me(){
        if (count>=1) {
            Scanner Sc = new Scanner(System.in);
            Random Sr = new Random();
            System.out.println("请选择商品的名称");
            name = Sc.next();
            System.out.println("请输入您的地址");
            addr = Sc.next();
            id = Sr.nextInt(10000) + 12345;
            System.out.println("已经为您随机生成单号" + id + "祝您购物愉快");
            count--;
        }
    }
    public void MakeChoice(BackJD TellJD){
        TellJD.Getinformation(id,name,addr);
    }
    @Override
    public void inform(String name) {
        System.out.println("我已收到"+name+"正在加急写红岩作业！！！！！！！");
    }
}
