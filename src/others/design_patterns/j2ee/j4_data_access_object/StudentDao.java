package others.design_patterns.j2ee.j4_data_access_object;

import java.util.List;

/**
 * @description:
 * @author:zhaojq
 * @date: 2020/5/22
 */
public interface StudentDao {
    public List<Student> getAllStudents();

    public Student getStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);
}
