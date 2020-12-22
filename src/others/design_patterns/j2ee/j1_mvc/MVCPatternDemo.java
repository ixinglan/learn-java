package others.design_patterns.j2ee.j1_mvc;


import others.design_patterns.j2ee.j1_mvc.controller.StudentController;
import others.design_patterns.j2ee.j1_mvc.model.Student;
import others.design_patterns.j2ee.j1_mvc.view.StudentView;

/**
 * @description: mvc模式
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class MVCPatternDemo {
    public static void main(String[] args) {
        //从数据库获取学生记录
        Student model = retrieveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();
        System.out.println("");
        //更新模型数据
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
