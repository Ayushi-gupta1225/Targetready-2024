package Assignments.day2.student_staff;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Staff extends Person {
    private String schoolName;
    private double salary;

    public Staff(String name, String address, String schoolName, double salary) {
        super(name, address);
        this.schoolName = schoolName;
        this.salary = salary;
    }
}


