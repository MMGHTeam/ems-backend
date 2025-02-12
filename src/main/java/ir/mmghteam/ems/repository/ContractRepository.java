package ir.mmghteam.ems.repository;

import ir.mmghteam.ems.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract,Long> {
}
