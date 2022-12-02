package top.xiaorang.interview.javase;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">fail-safe机制<p/>
 * @github <a href="https://github.com/xihuanxiaorang/my-interview">my-interview</a>
 * @Copyright 博客：<a href="https://blog.xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2022/12/1 17:04
 */
public class Test6 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>(new Integer[]{1, 7, 9, 11});
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
            if (i == 7) {
                // 在fail-safe模式下，这里不会被打印
                list.add(15);
            }
        }
    }
}
