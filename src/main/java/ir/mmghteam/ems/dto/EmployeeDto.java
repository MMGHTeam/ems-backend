package ir.mmghteam.ems.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// send data between server and client
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private Date birthDate;
    private Date startDate;
    private String educationLevel;
    private int salary;
    private String type;
    private String department;
    private String nationality;

}
