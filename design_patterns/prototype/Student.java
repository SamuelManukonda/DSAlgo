package design_patterns.prototype;

public class Student implements Prototype {
    private String name;
    private int age;
    private double psp;
    private String batchName;
    private double avgBatchPsp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public Student(Student student) {
        this.name = student.getName();
        this.age = student.getAge();
        this.psp = student.getPsp();
        this.batchName = student.getBatchName();
        this.avgBatchPsp = student.getAvgBatchPsp();
    }

    public Student() {
    }

    @Override
    public Student clone() {
        return new Student(this);
    }


}
