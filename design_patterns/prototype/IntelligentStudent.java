package design_patterns.prototype;

public class IntelligentStudent extends Student implements Prototype {

    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    public IntelligentStudent() {
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
