package academic.driver;

import java.util.ArrayList;
import java.util.Scanner;
import academic.model.*;

/**
 * @autors 12S23005 Ariella Sihombing
 * @autors 12S23035 Julius Sinaga
 */
public class Driver2 {

    public static void main(String[] _args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
        boolean isSame = false;
        Student studentTemp = null;
        Course courseTemp = null;

        while (scan.hasNext()) {
            isSame = false;
            // Masukan komen
            String command = scan.nextLine();

            if(command.equals("---")) {
                break;
            }

            // Pemisahan inputan dari "#"
            String[] inputTemp = command.split("#");
            if(inputTemp[0].equals("course-add")) {
                String kodeMatkul = inputTemp[1];
                String nameMatkul = inputTemp[2];
                int kreditSks = Integer.parseInt(inputTemp[3]);
                String gradeMinimum = inputTemp[4];

                // Cek apakah course sudah ada atau belum
                for(Course course : courses) {
                    if(course.getKodeMatkul().equals(kodeMatkul)) {
                        isSame = true;
                        break;
                    }
                }

                // Membuat objek course
                if(!isSame){
                    Course course = new Course(kodeMatkul, nameMatkul, kreditSks, gradeMinimum);
                    // Menambahkan course ke dalam arraylist
                    courses.add(course);
                }
            } else if(inputTemp[0].equals("student-add")) {
                String nim = inputTemp[1];
                String name = inputTemp[2];
                int year = Integer.parseInt(inputTemp[3]);
                String prodi = inputTemp[4];

                // Cek apakah student sudah ada atau belum
                for(Student student : students) {
                    if(student.getId().equals(nim)) {
                        isSame = true;
                        break;
                    }
                }

                if(!isSame) {
                    // Membuat objek student
                    Student student = new Student(nim, name, year, prodi);
                    // Menambahkan student ke dalam arraylist
                    students.add(student);
                }
            } else if(inputTemp[0].equals("enrollment-add")) {
                String kodeMatkul = inputTemp[1];
                String idStudent = inputTemp[2];
                String academicYear = inputTemp[3];
                String semester = inputTemp[4];
                boolean isStudent = false, isCourse = false;
                
                // Untuk pengecekan dulu baru keluaran invalid ketika semua nya sudah tidak ada
                for(Student student : students) {
                    if(student.getId().equals(idStudent)) {
                        isStudent = true;
                        studentTemp = student;
                        break;   
                    }
                }
                for(Course course : courses) {
                    if(course.getKodeMatkul().equals(kodeMatkul)) {
                        isCourse = true;
                        courseTemp = course;
                        break;
                    }
                }
                if(!isCourse){
                    System.out.println("invalid course|" + kodeMatkul);
                    continue;
                }
                if(!isStudent){
                    System.out.println("invalid student|" + idStudent);
                    continue;
                }
                if(isCourse && isStudent){
                    // Membuat objek enrollment
                    Enrollment enrollment = new Enrollment(courseTemp, studentTemp, semester ,academicYear);
                    // Menambahkan enrollment ke dalam arraylist
                    enrollments.add(enrollment);
                }
            }
        }

        // Menampilkan course dengan perulangan decrement
        for(int i = courses.size() - 1; i >= 0; i--) {
            System.out.println(courses.get(i).toString());
        }
        // Menampilkan student
        for(Student student : students) {
            System.out.println(student.toString());
        }
        // Menampilkan enrollment
        for(Enrollment enrollment : enrollments) {
            System.out.println(enrollment.toString());
        }

        scan.close();
    }

}