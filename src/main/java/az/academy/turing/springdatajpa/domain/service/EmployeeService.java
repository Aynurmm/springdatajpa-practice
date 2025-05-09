package az.academy.turing.springdatajpa.domain.service;

import az.academy.turing.springdatajpa.domain.dto.response.EmployeeResponse;
import az.academy.turing.springdatajpa.domain.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private  final EmployeeRepository employeeRepository;

    public List<EmployeeResponse>getAllEmployee(){
        return employeeRepository.findAll();
    }

}
