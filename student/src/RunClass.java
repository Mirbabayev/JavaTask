import java.util.ArrayList;

public class RunClass {
    public static void main(String[] args) {
        var stud1 = new Student("Eldar",123);
        var stud2 = new Student("Akif",124);
        var stud3 = new Student("Kamil",125);
        var stud4 = new Student("Huseyn",126);
        var stud5 = new Student("Fazil",127);
        var stud6 = new Student("Kamran",128);
        var stud7 = new Student("Kamran",129);



        Course kursStud = new Course("ATL");
        kursStud.addStudent(stud1);
        kursStud.addStudent(stud2);
        kursStud.addStudent(stud3);
        kursStud.addStudent(stud4);
        kursStud.addStudent(stud5);
        kursStud.addStudent(stud6);


        System.out.println("-------------");
        kursStud.addStudent(stud3);
        kursStud.addStudent(stud7);
        System.out.println("-------------");
        kursStud.isExist("Eldar",129);



        kursStud.printStudents();
        System.out.println("-----------------");
        kursStud.removeStudent(stud2);
        kursStud.removeStudent(stud4);
        System.out.println("-----------------");
        kursStud.printStudents();


    }
}
