package az.academy.turing.springdatajpa.domain.dto.request;

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
}
