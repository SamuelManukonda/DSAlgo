package design_patterns.prototype;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student studentPrototype =new Student();
        studentPrototype.setBatchName("April Batch 2023");
        studentPrototype.setAvgBatchPsp(90);
        studentRegistry.register("April Batch 2023", studentPrototype);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setAvgBatchPsp(99);
        intelligentStudent.setBatchName("Nov 22");
        intelligentStudent.setIq(180);

        studentRegistry.register("April Batch Intelligent", intelligentStudent);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry =new StudentRegistry();
        fillRegistry(studentRegistry);

        Student s1=  studentRegistry.get("April Batch 2023");
        Student clonedStudent = s1.clone();
        clonedStudent.setName("Dave");
        clonedStudent.setAge(21);
        clonedStudent.setPsp(78);
        clonedStudent.setBatchName("April");


        Student intelligentStudent = studentRegistry.get("April Batch Intelligent").clone();
        intelligentStudent.setPsp(89);
        intelligentStudent.setName("Ajay");
        intelligentStudent.setAge(25);

        System.out.println("DEBUG");
    }
}
