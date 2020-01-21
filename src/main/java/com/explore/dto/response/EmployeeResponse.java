package com.explore.dto.response;

import com.explore.domain.Employee;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.ResponseEntity;

@Builder
@Getter
public class EmployeeResponse {
    private Long employeeId;
    private String firstName;
    private String lastName;

    public static EmployeeResponse from(Employee employee) {
        return EmployeeResponse.builder()
                        .employeeId(employee.getEmployeeId())
                        .firstName(employee.getFirstName())
                        .lastName(employee.getLastName())
                        .build();
    }
}
