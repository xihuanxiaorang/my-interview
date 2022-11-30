package top.xiaorang.interview.javase;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; "><p/>
 * @github <a href="https://github.com/xihuanxiaorang/my-interview">my-interview</a>
 * @Copyright 博客：<a href="https://blog.xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2022/11/30 5:45
 */
public class Test3 {
    private static final Logger LOGGER = LoggerFactory.getLogger(Test3.class);

    public static void main(String[] args) {
        Set<Person> s = new HashSet<>();
        s.add(new Person("xiaorang", 18));
        s.add(new Person("xiaorang", 18));
        s.forEach(System.out::println);
    }
}

@Data
@AllArgsConstructor
class Person {
    private String name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
