package design_patterns.prototype.docs;

import design_patterns.prototype.Student;
import design_patterns.prototype.StudentRegistry;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student studentPrototype =new Student();
        studentPrototype.setBatchName("April Batch 2023");
        studentPrototype.setAvgBatchPsp(90);
        studentRegistry.register("April Batch 2023", studentPrototype);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry =new StudentRegistry();
        fillRegistry(studentRegistry);

        Student s1=  studentRegistry.get("April Batch 2023");
        Student clonedStudent = s1.clone();
        clonedStudent.setName("Dave");
        clonedStudent.setAge(21);
        clonedStudent.setBatchName("April");
    }
}
