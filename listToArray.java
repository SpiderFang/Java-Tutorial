//https://www.jianshu.com/p/ce3b6355f7ee
//Java,集合List與Array的轉換

import java.util.*;
public class Main {
public static void main(String[] args) throws Exception {
    List<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");

    // 使用泛型，无需显式类型转换
    String[] array = list.toArray(new String[list.size()]);
    System.out.println(array[0]);
}
}