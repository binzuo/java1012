package cn.edu.tsinghua.training.java;

/**
 * Created by Administrator on 2016/10/12 0012.
 */
public class FeiNiao1 extends FeiNiao {
    public void fly(){
        System.out.println("我不会飞");
    }
    public void callOverridedMethod(){
        super.fly();
    }

    public static void main(String[] args) {
        FeiNiao1 feiNiao1=new FeiNiao1();
        feiNiao1.fly();
        feiNiao1.callOverridedMethod();

    }

}
