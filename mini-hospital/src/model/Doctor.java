package model;

import java.time.LocalDate;

public class Doctor extends  Person {
    private Specialization specialization;
    private LocalDate employmentDate;

    public Doctor(String id, String name, LocalDate birthDate, String gender,LocalDate employmentDate,Specialization specialization) {
        super(id, name, birthDate, gender);
        this.employmentDate=employmentDate;
        this.specialization=specialization;

    }


    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    @Override
    String getInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialization=" + specialization +
                ", employmentDate=" + employmentDate +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                '}';
    }
}
