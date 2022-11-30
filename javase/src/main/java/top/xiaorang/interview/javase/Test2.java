package top.xiaorang.interview.javase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; "><p/>
 * @github <a href="https://github.com/xihuanxiaorang/my-interview">my-interview</a>
 * @Copyright 博客：<a href="https://blog.xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2022/11/23 10:05
 */
public class Test2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Test2.class);

    public static void main(String[] args) {
//        String s = new String("abc");
//        String s1 = "abc" + "def";
        String s2 = new String("abc") + new String("def");
        s2.intern();
        String s3 = "abcdef";
        LOGGER.debug("s2 == s3？{}", s2 == s3);
    }
}
