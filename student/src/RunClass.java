import java.util.ArrayList;

public class RunClass {
    public static void main(String[] args) {
        var stud1 = new Student("Eldar");
        var stud2 = new Student("Akif");
        var stud3 = new Student("Kamil");
        var stud4 = new Student("Huseyn");
        var stud5 = new Student("Fazil");
        var stud6 = new Student("Kamran");
        var stud7 = new Student("Kamran");

        Course kursStud = new Course("ATL");
        // kursa telebe elave etmek

        kursStud.addStudent(stud1);
        kursStud.addStudent(stud2);
        kursStud.addStudent(stud3);
        kursStud.addStudent(stud4);
        kursStud.addStudent(stud5);
        kursStud.addStudent(stud6);


        System.out.println("-------------");

        kursStud.addStudent(stud3);
        kursStud.addStudent(stud7);

    //   telebenin movcudlugun yoxlamaq

        kursStud.isExist("Eldar", 129);

    //   umumi telebeleri cap etmek
        kursStud.printStudents();
        System.out.println("-----------------");
    //   telebeni silmek
        kursStud.removeStudent(stud2);
        kursStud.removeStudent(stud4);
        System.out.println("-----------------");
        kursStud.printStudents();


    }
}
