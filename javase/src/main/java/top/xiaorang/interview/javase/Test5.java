package top.xiaorang.interview.javase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">fail-fast机制<p/>
 * @github <a href="https://github.com/xihuanxiaorang/my-interview">my-interview</a>
 * @Copyright 博客：<a href="https://blog.xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2022/12/1 16:38
 */
public class Test5 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("marry");
        names.add("jack");
        names.add("tom");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if ("marry".equals(name)) {
//                names.remove(name);
                iterator.remove();
            }
        }
    }
}
