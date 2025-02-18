package academic.model;

/**
 * @author 12S23005 Ariella Sihombing
 * @author 12S23035 Julius Sinaga
 */
public class Student {
    private String id;
    private String name;
    private int year;
    private String prodi;

    public Student(String _id, String _name, int _year, String _prodi) {
        this.id = _id;
        this.name = _name;
        this.year = _year;
        this.prodi = _prodi;
    }

    public Student() {
        this.id = "";
        this.name = "";
        this.year = 0;
        this.prodi = "";
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getyear() {
        return this.year;
    }

    public String getprodi() {
        return this.prodi;
    }
    
    // setId tidak digunakan lagi, karena id nantinya sudah diinisialisasi pada konstruktor

    @Override
    public String toString() {
        return id + "|" + name + "|" + year + "|" + prodi;
    }
}