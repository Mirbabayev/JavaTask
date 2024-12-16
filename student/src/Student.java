public class Student {
    private String studName;
    private int stud_ID ;
//    private int count =0;

    public Student() {
    }

    public Student(String studName,int stud_ID) {
        this.studName = studName;
        this.stud_ID =stud_ID;
//        count++;
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
