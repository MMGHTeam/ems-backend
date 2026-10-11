package ir.mmghteam.ems.service;

import ir.mmghteam.ems.dto.ContractDto;
import ir.mmghteam.ems.dto.EmployeeDto;

public interface ContractService {

    ContractDto createContract(ContractDto contractDto);

    ContractDto getContractById(Long contractId);
}
