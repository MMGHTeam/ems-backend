package ir.mmghteam.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "contracts")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String issuedFor;

    @Column(nullable = false)
    private String issuedBy;

    @Column(nullable = false)
    private Date issueDate;
    private Date startDate;
    private Date endDate;
    private String department;
    private int amount;
    private String details;
    private Boolean isDraft;
}
