package collection.map;

import org.junit.Test;

import java.util.*;

/**
 * HashMap: Map的主要实现类; 线程不安全; 存储null的key和value
 * --LindkedHashMap: 保证遍历Map元素时,可以按照添加的顺序实现遍历: 在原有的HashMap底层结构基础上, 添加了一对引用,指向前一个和后一个元素
 * 频繁的遍历操作,效率优于HashMap
 * <p>
 * HashTable: 旧的实现类; 纯种安全; 不能存储null的key和value
 * --Properties: 常用来处理配置文件, key-value都是String类型
 * <p>
 * TreeMap: 保证按照添加的key-value对进行排序,实现排序遍历; 此时考虑key的自然排序和定制排序
 * 底层使用红黑树 https://www.yycoding.xyz/post/2014/3/27/introduce-red-black-tree
 * <p>
 * 底层: 数组+链表(1.7)
 * 数组+链表+红黑树(1.8)
 */
public class MapTest {

    //常用方法
    @Test
    public void t2() {
        Map map = new HashMap();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);

        Set keys = map.keySet();
        for (Object key : keys) {
            System.out.println(key + ":" + map.get(key));
        }

        Collection values = map.values();
        Iterator iterator = values.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        Set set = map.entrySet();
        for (Object o : set) {
            Map.Entry entry = (Map.Entry) (o);
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    @Test
    public void t1() {
        Map map = new HashMap();
        map.put(null, null);
        System.out.println(map);

        Map map2 = new Hashtable();
        //为能为null
//        map2.put(null, null);
    }
}
