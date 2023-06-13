package Task2;

public class Student {

    String name;
    String course;
    String major;
    String email;
    String phoneNumber;
    Student[] friends;

    public static void printStudentDetails(Student[] students) {
        for(Student student : students)   {
            System.out.println("The name of the student is: " + student.name + ", ");
            System.out.println("The course of the student is: " + student.course + ", ");
            System.out.println("The major of the student is: " + student.major + ", ");
            System.out.println("The email of the student is: " + student.email + ", ");
            System.out.println("The phone number of the student is: " + student.phoneNumber + ", ");
            for(Student friend : student.friends) {
                System.out.println(friend.name + " is a friend of " + student.name);
            }
            System.out.println();
        }

    }

}
