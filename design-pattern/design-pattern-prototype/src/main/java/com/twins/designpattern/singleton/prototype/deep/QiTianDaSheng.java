package com.twins.designpattern.singleton.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * Created on 2019/3/11
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    private JinGuBang jinGuBang;

    public QiTianDaSheng() {
        super();
        this.jinGuBang = new JinGuBang();
    }

    public JinGuBang getJinGuBang() {
        return jinGuBang;
    }

    public void setJinGuBang(JinGuBang jinGuBang) {
        this.jinGuBang = jinGuBang;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    /**
     * 深克隆（值）——采用内存中对象字节码的直接克隆，类似于序列化与反序列化
     * ——会破坏单例模式
     *
     * @return
     */
    private Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
            copy.setBirthday(new Date());

            return copy;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public QiTianDaSheng shallowClone(QiTianDaSheng target) {
        QiTianDaSheng copy = new QiTianDaSheng();

        copy.setHeight(target.getHeight());
        copy.setWeight(target.getWeight());
        copy.setJinGuBang(target.getJinGuBang());
        copy.setBirthday(new Date());

        return copy;
    }
}
