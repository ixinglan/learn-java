package collection.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * hashMap的底层原理实现 及源码分析
 * 1. jdk7
 * HashMap map = new HashMap();
 * 在实例化以后,底层创建了长度是16的一维数组 Entry[] table;
 * ---多次put
 * map.put(k, v)
 * 首先,调用k所在类hashCode()计算k的 hash值,此hash值经过某种算法计算以后,得到Entry数组中的存放位置
 * 如果此位置数据为空,则k-v添加成功
 * 如果此位置数据不为空(存在1个或多个数据以链表形式存在),则比较k的hash值
 * 如果hash值不相同,则k-v添加成功
 * 如果hash值不相同,则通过k的equals方法比较
 * 如果equals() 返回false, 则k-v添加成功
 * 如果equals() 返回true, 则使用v替换相同k的value值
 * 在不断扩容过程中,当超过临界值且该位置不为Null,默认的扩容方式:扩容为原来容量的2位,并把旧的数据copy过来
 * <p>
 * 2. jdk8
 * HashMap map = new HashMap();
 * 初始化时,底层没有创建一个长度为16的数组(jdk8底层数组是Node[] ,而不是Entry[])
 * 首次put()时, 底层创建长度为16的数组
 * 当数组的某一个索引位置上的元素以链表形式存在的 数据个数>8 && 当前数组长度>64时,此时索引位置上的所有数据改为使用红黑树存储
 * <p>
 * 3. 源码分析
 * DEFAULT_INITIAL_CAPACITY : HashMap的默认容量，16
 * DEFAULT_LOAD_FACTOR：HashMap的默认加载因子：0.75
 * threshold：扩容的临界值，=容量*填充因子：16 * 0.75 => 12
 * TREEIFY_THRESHOLD：Bucket中链表长度大于该默认值，转化为红黑树:8
 * MIN_TREEIFY_CAPACITY：桶中的Node被树化时最小的hash表容量:64
 * <p>
 * LinkedHashMap 底层原理
 * static class Entry<K,V> extends HashMap.Node<K,V> {
 * Entry<K,V> before, after;
 * Entry(int hash, K key, V value, Node<K,V> next) {
 * super(hash, key, value, next);
 * }
 * }
 */
public class MapTest2 {
    @Test
    public void t2() {
        LinkedHashMap map = new LinkedHashMap();
        map.put(111, 1);
        map.put(222, 2);
        map.put(333, 3);

        System.out.println(map);//{111=1, 222=2, 333=3}
    }

    @Test
    public void t1() {
        HashMap map = new HashMap();
        map.put(111, 1);
        map.put(222, 2);
        map.put(333, 3);

        System.out.println(map);//{333=3, 222=2, 111=1}
    }
}
