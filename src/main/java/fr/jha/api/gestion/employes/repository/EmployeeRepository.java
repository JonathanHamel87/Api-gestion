package fr.jha.api.gestion.employes.repository;

import fr.jha.api.gestion.employes.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
