package design_patterns.builder;

public class Client {
    public static void main(String[] args) {

        //V1
//        Builder builder = new Builder();
//        builder.setAge(10);
//        builder.setGender(Gender.MALE);
//        builder.setName("Sam");
//        builder.setPsp(99);

//        Student student =new Student(builder);



        // V2
//        Builder builder1= Student.createBuilder();
//        builder.setAge(10);
//        builder.setGender(Gender.MALE);
//        builder.setName("Sam");
//        builder.setPsp(99);


//        Student student1 = builder1.build();


        //V3

        Student student =Student.createBuilder().setName("Sam").setAge(20).setGender(Gender.MALE).setPsp(99).build();

    }
}
