package others.design_patterns.creational.c4_builder.packImpl;


import others.design_patterns.creational.c4_builder.Packing;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/20
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
