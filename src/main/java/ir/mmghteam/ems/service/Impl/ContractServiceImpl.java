package ir.mmghteam.ems.service.Impl;

import ir.mmghteam.ems.dto.ContractDto;
import ir.mmghteam.ems.entity.Contract;
import ir.mmghteam.ems.exception.ResourceNotFoundException;
import ir.mmghteam.ems.mapper.ContractMapper;
import ir.mmghteam.ems.repository.ContractRepository;
import ir.mmghteam.ems.service.ContractService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContractServiceImpl implements ContractService {

    private ContractRepository contractRepository;

    public ContractDto createContract(ContractDto contractDto) {
        Contract contract = ContractMapper.mapToContract(contractDto);

        Contract savedContract = contractRepository.save(contract);

        return ContractMapper.mapToContractDto(savedContract);
    }
    @Override
    public ContractDto getContractById(Long contractId){
        Contract contract = contractRepository.findById(contractId)
                .orElseThrow(
                        () -> new ResourceNotFoundException
                                ("Contract no: " + contractId + " ,does not exist!")
                );
        return ContractMapper.mapToContractDto(contract);
    }
}
