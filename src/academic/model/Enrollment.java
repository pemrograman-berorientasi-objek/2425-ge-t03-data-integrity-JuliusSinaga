package academic.model;

/**
 * @author 12S23005 Ariella Sihombing
 * @author 12S23035 Julius Sinaga
 */
public class Enrollment {
    private Student student;
    private Course course;
    private String semester;
    private String academicYear;
    private String grade;

    public Enrollment(Course _course,Student _student , String _semester, String _academicYear) {
    student = _student;
    course = _course;
    this.semester = _semester;
    this.academicYear = _academicYear;
    this.grade = "None";    
    }

    public Student getStudent() {
        return this.student;
    }

    public Course getCourse() {
        return this.course;
    }

    public String getSemester() {
        return this.semester;
    }

    public String getAcademicYear() {
        return this.academicYear;
    }

    public String getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return course.getKodeMatkul() + "|" + student.getId() + "|" + academicYear + "|" + semester + "|" + grade;
    }

}