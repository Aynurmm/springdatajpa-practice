package az.academy.turing.springdatajpa.domain.mapper;


import az.academy.turing.springdatajpa.domain.dto.response.DepartmentResponse;
import az.academy.turing.springdatajpa.domain.model.Department;

@Mapper(componentModel = "spring")
public interface DepartmentMapper extends EntityMapper<Department, DepartmentResponse>{

    DepartmentMapper INSTANCE=  Mappers.getMapper(DepartmentMapper.class);
}
