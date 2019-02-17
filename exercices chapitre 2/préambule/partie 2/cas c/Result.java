package pack;

public class Result {
    public Student student;
    public Course course;
    public int mark;

    public Result(Student student, Course course, int mark){
        this.student = student;
        this.course = course;
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
