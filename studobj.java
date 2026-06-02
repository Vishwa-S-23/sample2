class Student {
    String name;
    int age;
    Student() {
        name = "default";
        age = 20;
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Student(String name) {
        this.name = name;
        age = 22;
    }
    public void display() {
        System.out.println("Name : " + name + " Age : " + age);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Vishwa", 21);
        Student s3 = new Student("Kumar");
        s1.display();
        s2.display();
        s3.display();
    }
}