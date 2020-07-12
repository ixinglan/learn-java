package collection.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @description:
 * @author:zhaojq
 */
public class CollectionTest1 {
    @Test
    public void t2() {
        //错误写法
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add("abc");
        collection.add(false);
        collection.add(456);

        //错误1
        Iterator iterator = collection.iterator();
        while (iterator.next() != null) {
            System.out.println(iterator.next());
        }

        //错误2: 每次iterator都是一个新的Iterator迭代器
        while (collection.iterator().hasNext()) {
            System.out.println(collection.iterator().next());
        }
    }

    @Test
    public void t1() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add("abc");
        collection.add(false);
        collection.add(456);

        Iterator iterator = collection.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
