package cn.edu.tsinghua.training.java;

/**
 * Created by Administrator on 2016/10/12 0012.
 */
public class ChongXie {
    String name;
    int xuHao;
    int number;
    void print(){
        System.out.println("公司名称："+name+" 序号："+xuHao+" 公司人数："+number);
    }
    ChongXie(String name,int xuHao,int number){
        this.name=name;
        this.xuHao=xuHao;
        this.number=number;
    }
}
