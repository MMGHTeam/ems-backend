package ir.mmghteam.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContractDto {

    private long id;
    private String issuedFor;
    private String issuedBy;
    private Date issueDate;
    private Date startDate;
    private Date endDate;
    private String department;
    private int amount;
    private String details;
    private Boolean isDraft;

}
