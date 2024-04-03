package Assignments.day2.student_staff;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper = true)
public class Person {
    private String name;
    private String address;

//    public Person(String name, String address) {
//        this.name = name;
//        this.address = address;
//    }
}

