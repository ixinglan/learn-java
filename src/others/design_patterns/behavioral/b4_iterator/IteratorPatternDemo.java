package others.design_patterns.behavioral.b4_iterator;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/21
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
