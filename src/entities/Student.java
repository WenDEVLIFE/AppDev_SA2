package entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String studentName;
    private String yearLevel;
    private String email;
    private String program;
    private String gender;
    private String phone;

    public Student() {}

    public Student(String studentName, String yearLevel, String email, String program, String gender, String phone) {
        this.studentName = studentName;
        this.yearLevel = yearLevel;
        this.email = email;
        this.program = program;
        this.gender = gender;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getGender() {
        return gender;
    }
}
