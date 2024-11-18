package ir.mmghteam.ems.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private Date birthDate;
    private Date startDate;
    private String educationLevel;
    private int salary;

    @Column(name = "emp_type")
    private String type;
    private String department;
    private String nationality;
    private Boolean status;
    

}