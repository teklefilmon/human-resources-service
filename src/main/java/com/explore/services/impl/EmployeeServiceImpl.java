package com.explore.services.impl;

import com.explore.domain.Employee;
import com.explore.dto.request.EmployeeRequest;
import com.explore.repositories.EmployeeRepository;
import com.explore.services.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@AllArgsConstructor
class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(EmployeeRequest employeeRequest) {
        log.debug("Saving employee to database");
        Employee employee = employeeRepository.save(Employee.from(employeeRequest));
        log.info("Employee saved to database. Generated id: {}", employee::getEmployeeId);
        return employee;
    }
}