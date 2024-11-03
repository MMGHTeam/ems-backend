package ir.mmghteam.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ir.mmghteam.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    
}
