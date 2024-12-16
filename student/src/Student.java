public class Student {
    private int son_ID=123;
    private String studName;
    private int stud_ID ;
//   almis private int count =0;

    public Student() {
    }

    public Student(String studName) {
        this.studName = studName;
        this.stud_ID =++son_ID ;
    }


    public String getStudName() {
        return this.studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getStud_ID() {
        return this.stud_ID;
    }

    public void setStud_ID(int stud_ID) {
        this.stud_ID = stud_ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studName='" + studName + '\'' +
                ", stud_ID='" + stud_ID + '\'' +
                '}';
    }
}
