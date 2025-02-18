package academic.model;

/**
 * @author 12S23005 Ariella Sihombing
 * @author 12S23035 Julius Sinaga
 */
public class Course {
    private String kodeMatkul;
    private String namaMatkul;
    private int kreditSks;
    private String gradeMinimum;

    public Course(String _kodeMatkul, String _namaMatkul, int _kreditSks, String _gradeMinimum) {
        this.kodeMatkul = _kodeMatkul;
        this.namaMatkul = _namaMatkul;
        this.kreditSks = _kreditSks;
        this.gradeMinimum = _gradeMinimum;
    }

    public Course() {
        this.kodeMatkul = "";
        this.namaMatkul = "";
        this.kreditSks = 0;
        this.gradeMinimum = "";
    }

    public String getKodeMatkul() {
        return this.kodeMatkul;
    }

    public String getNamaMatkul() {
        return this.namaMatkul;
    }

    public int getKreditSks() {
        return this.kreditSks;
    }

    public String getGradeMinimum() {
        return this.gradeMinimum;
    }
    
    // setKodeMatkul tidak digunakan lagi, karena kodeMatkul nantinya sudah diinisialisasi pada konstruktor
    
    @Override
    public String toString() {
        return kodeMatkul + "|" + namaMatkul + "|" + kreditSks + "|" + gradeMinimum;
    }
}