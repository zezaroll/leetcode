package test_package;

import java.util.*;

public interface Discounter {

}

class Hell {
    public static void main(String[] args) {
        Boolean g = Boolean.getBoolean("0");
        System.out.println(g != null && g);

//        List<String> stringList = new ArrayList<>();
//        stringList.add("1");
//        stringList.add("2");
//        stringList.add("3");
//        stringList.add("4");
//
//        Optional<String> reduce = stringList.stream().reduce((x, y) -> x + " ;" + y);
//        reduce.ifPresent(System.out::println);
//
//        String reduce1 = stringList.stream().reduce("0", (x, y) -> x + y);
    }
}