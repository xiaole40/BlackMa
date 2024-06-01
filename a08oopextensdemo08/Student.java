package BlackMa.com.lele.a08oopextensdemo08;

public class Student {
    String name;
    int age;
    String school;

    public Student() {
        this(null,0,"清华大学");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
