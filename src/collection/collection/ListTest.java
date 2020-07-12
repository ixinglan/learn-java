package collection.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @description: 鉴于 Java 中数组用来存储数据 的局限性，我们通常使用 List 替代数组
 * List 集合类中 元素有序、且可重复 ，集合中的每个元素都有其对应的顺序索引。
 * List 容器中的元素都对应一个整数型的序号记载其在容器中的位置，可以根据序号存取容器中的元素。
 * JDK API 中 List 接口的实现类常用的有： ArrayList 、 LinkedList 和 Vector
 * <p>
 * ArrayList 、 LinkedList 和 Vector的异同
 * 同:都实现List接口,存储有序的,可重复的数据;底层用Object[]
 * ArrayList: 作为list接口的主要实现类
 * LinkedList: 底层使用双向链表存储, 频繁插入\删除操作,效率高
 * Vector: 作为list接口的旧实现类(1.2),线程安全
 */
public class ListTest {
    /**
     * 3. LinkedList的源码分析：
     * LinkedList list = new LinkedList(); 内部声明了Node类型的first和last属性，默认值为null
     * list.add(123);//将123封装到Node中，创建了Node对象。
     * <p>
     * 其中，Node定义为：体现了LinkedList的双向链表的说法
     * private static class Node<E> {
     * E item;
     * Node<E> next;
     * Node<E> prev;
     * <p>
     * Node(Node<E> prev, E element, Node<E> next) {
     * this.item = element;
     * this.next = next;
     * this.prev = prev;
     * }
     * }
     */
    @Test
    public void t2() {
        LinkedList list = new LinkedList();
        list.add(0);
    }

    /**
     * 2. ArrayList的源码分析：
     * 2.1 jdk 7情况下
     * ArrayList list = new ArrayList();//底层创建了长度是10的Object[]数组elementData
     * list.add(123);//elementData[0] = new Integer(123);
     * ...
     * list.add(11);//如果此次的添加导致底层elementData数组容量不够，则扩容。
     * 默认情况下，扩容为原来的容量的1.5倍，同时需要将原有数组中的数据复制到新的数组中。
     * <p>
     * 结论：建议开发中使用带参的构造器：ArrayList list = new ArrayList(int capacity)
     * <p>
     * 2.2 jdk 8中ArrayList的变化：
     * ArrayList list = new ArrayList();//底层Object[] elementData初始化为{}.并没有创建长度为10的数组
     * <p>
     * list.add(123);//第一次调用add()时，底层才创建了长度10的数组，并将数据123添加到elementData[0]
     * ...
     * 后续的添加和扩容操作与jdk 7 无异。
     * 2.3 小结：jdk7中的ArrayList的对象的创建类似于单例的饿汉式，而jdk8中的ArrayList的对象
     * 的创建类似于单例的懒汉式，延迟了数组的创建，节省内存
     */
    @Test
    public void t1() {
        ArrayList list = new ArrayList();
        list.add(111);
        list.add(222);
        list.add(333);

        List list2 = Arrays.asList(1, 2, 3);
        list.addAll(list2);
        System.out.println(list.size());

        //remove(index) 和 remove(Object)的区别
        System.out.println(list);
        list.remove(0);
        list.remove(Integer.valueOf(222));
        System.out.println(list);
    }
}
