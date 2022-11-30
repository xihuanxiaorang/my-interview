package top.xiaorang.interview.javase.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">使用JDK自带的字节流实现的深度克隆工具类<p/>
 * @github <a href="https://github.com/xihuanxiaorang/my-interview">my-interview</a>
 * @Copyright 博客：<a href="https://blog.xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2022/11/30 13:20
 */
public class StreamClone {
    public static <T extends Serializable> T clone(T obj) {
        T cloneObj;
        try (
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos);
        ) {
            oos.writeObject(obj);
            try (
                    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                    ObjectInputStream ois = new ObjectInputStream(bis);
            ) {
                cloneObj = (T) ois.readObject();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cloneObj;
    }
}
