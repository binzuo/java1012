package cn.edu.tsinghua.training.java;

/**
 * Created by Administrator on 2016/10/12 0012.
 */
public class ChongXie1 extends ChongXie {
    //ChongXie1(String name, int xuHao, int number) {
    //    super(name, xuHao, number);
    //}

    String diZhi;
    ChongXie1(String name, int xuHao, int number,String diZhi) {
        super(name, xuHao, number);
        this.diZhi=diZhi;
    }
    void print(){
        System.out.println("学院/系别："+name+"  序号："+xuHao+"  总人数："+number+"  地址:"+diZhi);
    }

    public static void main(String[] args) {
        ChongXie1 chongXie1=new ChongXie1("计算机系",20,2000,"北京市");
        chongXie1.print();
    }
}
