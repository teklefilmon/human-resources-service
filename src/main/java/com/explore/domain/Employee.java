package com.explore.domain;

import com.explore.dto.request.EmployeeRequest;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Log4j2
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String firstName;
    private String lastName;

    public static Employee from(EmployeeRequest employeeRequest) {
        log.debug("Converting employee request to entity");
        Employee employee = new Employee();
        employee.setFirstName(employeeRequest.getFirstName());
        employee.setLastName(employeeRequest.getLastName());
        log.debug("Employee request converted to entity");
        return employee;
    }
}
