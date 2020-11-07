package Redrock3.Level4;
import sun.security.jca.GetInstance;

import java.lang.reflect.Field;
import java.util.Random;
public class Level4 {
    private Object object;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException {
        Date1 date1=new Date1();
        Date2 date2=new Date2();
        Random Rd=new Random();//营造随机效果
        Object object;
        Field field,field1;
        int index= Rd.nextInt(2);
        if (index==1) {
            date1.date();
            object=date1;
        }
        else {
            date2.date();
            object=date2;
        }//用object接受Date1 Date2 的实例化对象
        Class c=object.getClass(); //反射得到对象的name
        System.out.println("您已经调用"+object.getClass().getSimpleName()+"类"+object.getClass().getField("date").getType()+"类数据类型");
        Object obj=object.getClass().getField("date").getType();
        if (obj.toString().equals("class java.lang.String")){
            field =object.getClass().getField("x");
        }
        else{
            field=Class.forName("Redrock3.Level4.Date2").getField("date");
            field1 =object.getClass().getField("x");
            field.set(date2,String.valueOf(field1.get(date1)));

//            Field field =object.getClass().getField("date");
//            Field field1=object.getClass().getField("x");
//            field.set(date1,Integer.valueOf(String.valueOf(field1.get(date1))));
        }
        System.out.println(field.get(date2));
    }
}
