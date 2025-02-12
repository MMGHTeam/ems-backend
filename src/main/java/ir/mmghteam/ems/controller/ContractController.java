package ir.mmghteam.ems.controller;

import ir.mmghteam.ems.dto.ContractDto;
import ir.mmghteam.ems.service.ContractService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/contracts")
public class ContractController {
    private ContractService contractService;

    @PostMapping
    public ResponseEntity<ContractDto> createContract(@RequestBody ContractDto contractDto){
        ContractDto savedContract = contractService.createContract(contractDto);

        return new ResponseEntity<>(savedContract, HttpStatus.CREATED);
    }
}
