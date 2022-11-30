package top.xiaorang.interview.javase;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">浅拷贝与深拷贝<p/>
 * @github <a href="https://github.com/xihuanxiaorang/my-interview">my-interview</a>
 * @Copyright 博客：<a href="https://blog.xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2022/11/30 11:40
 */
public class Test4 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Test4.class);

    public static void main(String[] args) {
        Address address = new Address(1, "changsha");
        People p1 = new People(1, "xiaorang", address);
        Gson gson = new Gson();
        People p2 = gson.fromJson(gson.toJson(p1), People.class);

        LOGGER.info("p1 == p2 ? {}", p1 == p2);
        p1.getAddress().setCity("shenzhen");
        LOGGER.info("p2.getAddress().getCity() = {}", p2.getAddress().getCity());
    }
}

@Data
@AllArgsConstructor
class People implements Serializable {
    private Integer id;
    private String name;
    private Address address;
}

@Data
@AllArgsConstructor
class Address implements Serializable {
    private Integer id;
    private String city;
}
