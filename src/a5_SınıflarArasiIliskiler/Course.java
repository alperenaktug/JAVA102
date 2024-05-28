package a5_SınıflarArasiIliskiler;

public class Course {


    public String courseName;
    public String code;

    public Course(String courseName , String code){
        this.courseName = courseName;
        this.code = code;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double calcAvarage(Student [] students ){
        double avarage = 0;
        for (int i = 0 ; i < students.length ; i++){
            avarage += students[i].getNote();
        }
        return avarage / students.length;
    }
}
