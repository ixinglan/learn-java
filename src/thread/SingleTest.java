package thread;

/**
 * @description:
 * @author:zhaojq
 */
public class SingleTest {
    private  SingleTest singleTest;

    private SingleTest(){

    }

    public SingleTest getInstance(){
        if(singleTest == null){
            synchronized (SingleTest.class){
                if(singleTest == null){
                    singleTest = new SingleTest();
                }
                return singleTest;
            }
        }
        return singleTest;
    }
}
