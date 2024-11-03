package ir.mmghteam.ems.mapper;

import ir.mmghteam.ems.dto.EmployeeDto;
import ir.mmghteam.ems.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
            employee.getId(),
            employee.getFirstName(),
            employee.getLastName(),
            employee.getEmail(),
            employee.getBirthDate(),
            employee.getStartDate(),
            employee.getEducationLevel(),
            employee.getSalary(),
            employee.getType(),
            employee.getDepartment(),
            employee.getNationality()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
            employeeDto.getId(),
            employeeDto.getFirstName(),
            employeeDto.getLastName(),
            employeeDto.getEmail(),
            employeeDto.getBirthDate(),
            employeeDto.getStartDate(),
            employeeDto.getEducationLevel(),
            employeeDto.getSalary(),
            employeeDto.getType(),
            employeeDto.getDepartment(),
            employeeDto.getNationality()
        );
    }

}
