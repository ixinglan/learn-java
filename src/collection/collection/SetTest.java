package collection.collection;

import org.junit.Test;

import java.util.*;

/**
 * |----Collection接口：单列集合，用来存储一个一个的对象
 * |----Set接口：存储无序的、不可重复的数据   -->高中讲的“集合”
 * |----HashSet：数组+链表的结构,作为Set接口的主要实现类；线程不安全的；可以存储null值
 * |----LinkedHashSet：作为HashSet的子类；遍历其内部数据时，可以按照添加的顺序遍历
 * 对于频繁的遍历操作，LinkedHashSet效率高于HashSet.
 * |----TreeSet：可以按照添加对象的指定属性，进行排序
 * 要求：向Set(主要指：HashSet、LinkedHashSet)中添加的数据，其所在的类一定要重写hashCode()和equals()
 * 重写的hashCode()和equals()尽可能保持一致性：相等的对象必须具有相等的散列码
 * 重写两个方法的小技巧：对象中用作 equals() 方法比较的 Field，都应该用来计算 hashCode 值。
 */
public class SetTest {

    /*
    添加过程,以HashSet为例,添加元素a:
    1. 首先调用hashCode(),计算hash值,以此hash值通过底层算法计算出在HashSet底层数组中的存放位置(索引位置)
    2. 如果此位置没有元素,a添加成功; 如果此位置有其他元素b, 则比较a和b的hash值
    3. 如果hash值不相同, a添加成功; 如果hash值相同,则调用equals方法
    4. equals为true, 则a添加失败; 反之

    对于添加成功的情况2和情况3而言：元素a 与已经存在指定索引位置上数据以链表的方式存储。
        jdk 7 :元素a放到数组中，指向原来的元素。
        jdk 8 :原来的元素在数组中，指向元素a
        总结：七上八下
     */
    @Test
    public void test1() {
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(129);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //LinkedHashSet的使用
    //LinkedHashSet作为HashSet的子类，在添加数据的同时，每个数据还维护了两个引用，记录此数据前一个数据和后一个数据。
    //优点：对于频繁的遍历操作，LinkedHashSet效率高于HashSet
    @Test
    public void test2() {
        Set set = new LinkedHashSet();
        set.add(456);
        set.add(123);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(129);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //去重
    @Test
    public void t4() {
        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(4));
        list.add(new Integer(4));
        List list2 = duplicateList(list);
        for (Object integer : list2) {
            System.out.println(integer);
        }
    }

    public static List duplicateList(List list) {
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }

    @Test
    public void test5() {
        HashSet set = new HashSet();
        User u1 = new User("Tom", 12);
        User u2 = new User("Jack", 15);

        set.add(u1);
        set.add(u2);
        System.out.println(set);

        u1.setName("cc");
        set.remove(u1);//会失败,add时是以Tom为hash值对应的位置,以cc得到的hash值不在以Tom为hash值的位置
        System.out.println(set);
        set.add(new User("cc", 12));//新位置
        System.out.println(set);
        set.add(new User("Tom", 12));//也能加成功,hashCode值一样,但equals的时候不一样,因为u1变为cc了
        System.out.println(set);

    }
}
