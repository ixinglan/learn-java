package others.design_patterns.j2ee.j1_mvc.view;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/22
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
