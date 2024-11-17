package ir.mmghteam.ems.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ir.mmghteam.ems.dto.EmployeeDto;
import ir.mmghteam.ems.entity.Employee;
import ir.mmghteam.ems.exception.ResourceNotFoundException;
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

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
        .orElseThrow(
            () -> new ResourceNotFoundException
        ("Employee no: " + employeeId + " ,does not exist!")
        );

        return EmployeeMapper.mapToEmployeeDto(employee);

    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();

        return employees.stream()
                         .map((employee) -> EmployeeMapper.mapToEmployeeDto(employee))
                         .collect(Collectors.toList());
        
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {
        
        Employee employee = employeeRepository.findById(employeeId)
                          .orElseThrow(
                            () -> new ResourceNotFoundException("Employee no: " + employeeId + ",does not exist!")
                          );
        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setBirthDate(updatedEmployee.getBirthDate());
        employee.setDepartment(updatedEmployee.getDepartment());
        employee.setEducationLevel(updatedEmployee.getEducationLevel());
        employee.setEmail(updatedEmployee.getEmail());
        employee.setNationality(updatedEmployee.getNationality());
        employee.setSalary(updatedEmployee.getSalary());
        employee.setStartDate(updatedEmployee.getStartDate());
        employee.setType(updatedEmployee.getType());

        Employee updatedEmployeeObj = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(updatedEmployeeObj);

    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepository.findById(employeeId)
        .orElseThrow(
          () -> new ResourceNotFoundException("Employee no: " + employeeId + ",does not exist!")
        );

        employeeRepository.deleteById(employeeId);
    }

}
