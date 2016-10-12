package cn.edu.tsinghua.training.java;

import jiekou.JieKou;

/**
 * Created by Administrator on 2016/10/12 0012.
 */
public class JieKou1 implements JieKou {
    @Override
    public void print() {
        System.out.println(a+b);

    }
    @Override
    public void print1() {
        System.out.println(c+d);

    }

    public static void main(String[] args) {
        JieKou1 jieKou1=new JieKou1();
        jieKou1.print();
        jieKou1.print1();
    }
}
