package az.academy.turing.springdatajpa.domain.repository;

import az.academy.turing.springdatajpa.domain.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
