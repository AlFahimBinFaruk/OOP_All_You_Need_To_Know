package DynamicPolyExample;

public class Test {
    public static void main(String[] args){

        // Watch : https://www.youtube.com/watch?v=ldrDMD0zZPM

        /**
         * "Person" is the parent class of "Student" and "Teacher".
         **/

        // Person
        Person myPerson=new Person();
        myPerson.printInfo();

        // Student
        myPerson=new Student();
        myPerson.printInfo();
        // myPerson.printStudentNo(); // I will not get this as the type of this is "Person" and printStudentNo() is not available in "Person"

        Student myStudent=new Student();
        myStudent.printStudentNo(); // now I will get printStudentNo() because type is now "Student"

        // Teacher
        myPerson=new Teacher();
        myPerson.printInfo();
    }
}
