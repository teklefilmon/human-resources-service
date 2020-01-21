package com.explore.services;

import com.explore.domain.Employee;
import com.explore.dto.request.EmployeeRequest;

public interface EmployeeService {
    Employee createEmployee(EmployeeRequest employeeRequest);
}
