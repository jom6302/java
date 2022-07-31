package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee;

import java.util.Optional;

// 泛型介面 JapRepository(T,ID)
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    void deleteEmployeeByid(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
