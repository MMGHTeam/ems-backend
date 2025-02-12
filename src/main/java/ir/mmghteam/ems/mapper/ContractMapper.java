package ir.mmghteam.ems.mapper;

import ir.mmghteam.ems.dto.ContractDto;
import ir.mmghteam.ems.entity.Contract;

public class ContractMapper {
    public static ContractDto mapToContractDto(Contract contract){
        return new ContractDto(
                contract.getId(),
                contract.getIssuedFor(),
                contract.getIssuedBy(),
                contract.getIssueDate(),
                contract.getStartDate(),
                contract.getEndDate(),
                contract.getDepartment(),
                contract.getAmount(),
                contract.getDetails(),
                contract.getIsDraft()
        );
    }
    public static Contract mapToContract(ContractDto contractDto){
        return new Contract(
                contractDto.getId(),
                contractDto.getIssuedFor(),
                contractDto.getIssuedBy(),
                contractDto.getIssueDate(),
                contractDto.getStartDate(),
                contractDto.getEndDate(),
                contractDto.getDepartment(),
                contractDto.getAmount(),
                contractDto.getDetails(),
                contractDto.getIsDraft()
        );
    }
}
