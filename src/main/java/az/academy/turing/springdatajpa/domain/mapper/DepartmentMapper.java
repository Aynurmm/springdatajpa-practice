package az.academy.turing.springdatajpa.domain.mapper;


import az.academy.turing.springdatajpa.domain.dto.response.DepartmentResponse;
import az.academy.turing.springdatajpa.domain.model.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DepartmentMapper extends EntityMapper <Department, DepartmentResponse> {

    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);
}
