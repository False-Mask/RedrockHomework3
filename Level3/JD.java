package Redrock3.Level3;
public class JD implements BackJD{
    public JD(){

    }
    public JD(int x){

    }
    public void Getinformation(int id,String name,String addr){
        System.out.println("JD已经收到您"+name+"用户的"+id+"号订单"+"正在加急送往"+addr);
        BackMe backMe=new Me();
        backMe.inform(name);
    }
}
