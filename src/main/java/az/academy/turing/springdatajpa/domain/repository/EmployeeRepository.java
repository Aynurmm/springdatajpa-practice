package az.academy.turing.springdatajpa.domain.repository;

import az.academy.turing.springdatajpa.domain.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
