package com.twins.designpattern.singleton.prototype.deep;

/**
 * Created on 2019/3/11
 */
public class DeepCloneTest {

    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try {
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println("深克隆： " + (qiTianDaSheng.getJinGuBang() == clone.getJinGuBang()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        QiTianDaSheng qiTianDaSheng2 = new QiTianDaSheng();
        QiTianDaSheng qiTianDaSheng3 = qiTianDaSheng.shallowClone(qiTianDaSheng2);
        System.out.println("浅克隆： " + (qiTianDaSheng2.getJinGuBang() == qiTianDaSheng3.getJinGuBang()));
    }
}
