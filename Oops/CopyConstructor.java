public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Banty";
        s1.rollno = 112;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }

    static class Student {
        int marks[] = new int[3];
        String name;
        int rollno;

        Student() {

        }

        Student(Student s1) { // copy constructor
            this.name = s1.name;
            this.rollno = s1.rollno;
            this.marks = s1.marks;
        }
    }
}
