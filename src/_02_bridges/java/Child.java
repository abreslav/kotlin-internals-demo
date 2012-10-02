package _02_bridges.java;

public class Child extends Base<Integer> {
    @Override
    Integer foo(Integer s) {
        return s;
    }
}
