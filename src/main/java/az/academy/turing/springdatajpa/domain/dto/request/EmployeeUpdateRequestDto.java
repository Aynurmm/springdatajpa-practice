package az.academy.turing.springdatajpa.domain.dto.request;

import az.academy.turing.springdatajpa.domain.enums.EmployeeStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeUpdateRequestDto {
    private String name;
    private String position;
    private double salary;
    private EmployeeStatus employeeStatus;
}
