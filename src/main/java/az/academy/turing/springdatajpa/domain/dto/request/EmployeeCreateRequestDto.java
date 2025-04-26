package az.academy.turing.springdatajpa.domain.dto.request;

import az.academy.turing.springdatajpa.domain.enums.EmployeeStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeCreateRequestDto {

    private String name;
    private String position;
    private double salary;
    private EmployeeStatus employeeStatus=EmployeeStatus.ACTIVE;
}
