package az.academy.turing.springdatajpa.domain.mapper;

import az.academy.turing.springdatajpa.domain.dto.response.EmployeeResponse;
import az.academy.turing.springdatajpa.domain.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper extends EntityMapper<Employee, EmployeeResponse> {
    @Override
    public Employee toDto(EmployeeResponse employeeResponse);

    @Override
    public EmployeeResponse toEntity(Employee employee);
}
