package others.design_patterns.creational.c4_builder;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
