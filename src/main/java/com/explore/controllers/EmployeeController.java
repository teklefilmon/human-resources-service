package com.explore.controllers;

import com.explore.domain.Employee;
import com.explore.dto.request.EmployeeRequest;
import com.explore.dto.response.EmployeeResponse;
import com.explore.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController("/employees")
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody @Valid EmployeeRequest employeeRequest) {
        Employee employee = employeeService.createEmployee(employeeRequest);
        EmployeeResponse response = EmployeeResponse.from(employee);
        String localtion = "/employees/" + response.getEmployeeId().toString();
//        return ResponseEntity.created(localtion);
        return null;
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeResponse> getEmployee(@PathVariable("employeeId") int employeeId) {
        //TODO:
        return null;
    }

    @GetMapping
    public ResponseEntity<List<EmployeeResponse>> getEmployees() {
        //TODO:
        return null;
    }
}
