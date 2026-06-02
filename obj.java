class student {
    String name;
    int age;

    public void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

public class obj {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "test";
        s1.age = 20;
        s1.display();
        s1.name="Vishwa";
        s1.age=20;
        s1.display();
    }
}