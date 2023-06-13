package Task2;

import static Task2.Student.printStudentDetails;

public class StudentTest {

    public static void main(String[] args) {

        Student a = new Student();
        Student b = new Student();
        Student c = new Student();

        a.name = "John";
        a.course = "IT";
        a.major = "QA";
        a.email = "a@campus.com";
        a.phoneNumber = "1234567";

        b.name = "Lisa";
        b.course = "IT";
        b.major = "QA";
        b.email = "b@campus.com";
        b.phoneNumber = "612431";

        c.name = "Monica";
        c.course = "IT";
        c.major = "QA";
        c.email = "c@campus.com";
        c.phoneNumber = "7253251";

        a.friends = new Student[]{b, c};
        b.friends = new Student[]{a, c};
        c.friends = new Student[]{b, a};

        Student[] students = {a, b, c};

        printStudentDetails(students);

    }

}
