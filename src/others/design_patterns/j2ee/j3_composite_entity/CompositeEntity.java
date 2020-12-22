package others.design_patterns.j2ee.j3_composite_entity;


import others.design_patterns.j2ee.j3_composite_entity.entity.CoarseGrainedObject;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
