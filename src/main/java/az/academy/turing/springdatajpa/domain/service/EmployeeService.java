package az.academy.turing.springdatajpa.domain.service;

import az.academy.turing.springdatajpa.domain.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private  final EmployeeRepository employeeRepository;

}
