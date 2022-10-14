package top.xiaorang.interview.javase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; "><p/>
 * @github <a href="https://github.com/xihuanxiaorang/my-interview">my-interview</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/14 6:31
 */
public class Test1 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Test1.class);

    public static void main(String[] args) {
        Integer a1 = 100;
        Integer a2 = 100;
        Integer a3 = 128;
        Integer a4 = 128;
        int a5 = 128;
        LOGGER.debug("a1 == a2？{}", a1 == a2);
        LOGGER.debug("a3 == a4？{}", a3 == a4);
        LOGGER.debug("a3 == a5？{}", a3 == a5);
    }
}
