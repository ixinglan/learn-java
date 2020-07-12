package collection.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @description: Iterator 可以删除集合的元素 但是是遍历过程中通过迭代器对象的 remove 方法 不是集合对象的 remove 方法 。
 * 如果还未调用 next() 或在上一次调用 next 方法之后已经调用了 remove 方法再调用 remove 都会报 IllegalStateException
 */
public class CollectionTest2 {
    @Test
    public void t1() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add("abc");
        collection.add(false);
        collection.add(456);

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (next.equals(123)) {
                iterator.remove();
            }
        }

        Iterator iterator2 = collection.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
