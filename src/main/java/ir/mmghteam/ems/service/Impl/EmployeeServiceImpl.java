package ir.mmghteam.ems.service.Impl;

import org.springframework.stereotype.Service;

import ir.mmghteam.ems.dto.EmployeeDto;
import ir.mmghteam.ems.entity.Employee;
import ir.mmghteam.ems.mapper.EmployeeMapper;
import ir.mmghteam.ems.repository.EmployeeRepository;
import ir.mmghteam.ems.service.EmployeeService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

}
