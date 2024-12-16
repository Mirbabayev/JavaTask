import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> studList;
    public int count = 0;


    public Course(String kursName) {
        this.courseName = kursName;
        this.studList = new ArrayList<>();

    }

    public void isExist(String std,int id) {

        for (Student l : studList) {
            if(l.getStudName().equals(std)&&(l.getStud_ID()==id)){
                System.out.println("bu telebe var");
            }else{
                System.out.println("Telebe tapilmadi");

            }
            return;
        }
    }

    public void addStudent(Student std) {
        if (!studList.contains(std)) {
            this.studList.add(std);
            System.out.println("Telebe adi: " + std.getStudName() +
                    "\n" + "Telebe ID: " + std.getStud_ID() +" - ugurla elave edildi.");
        } else {
            System.out.println("Telebe adi: " + std.getStudName() +
                    "\n" + "Telebe ID: " + std.getStud_ID() + " artiq  qeydiyyatdan kecib.");
        }


    }

    public void removeStudent(Student std) {
        if (studList.contains(std)) {
            System.out.println("Bildiris: " + "\n" + "Telebe adi: " + std.getStudName() +
                    "\n" + "Telebe ID: " + std.getStud_ID() + " ! Kursdan silindi !");
            this.studList.remove(std);

        } else {
            System.out.println(std.getStudName() + " melumat tapilmadi!!! ");
        }
    }
//    umumi telebeleri cap etsin

    public void printStudents() {

        for (Student std : this.getStudList()) {

            System.out.println("Telebe: " + std.getStudName() + " -" + " ID: " + std.getStud_ID() + " ;");
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Student> getStudList() {
        return studList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName=" + courseName +
                ", studList=" + studList +
                '}';
    }
}
