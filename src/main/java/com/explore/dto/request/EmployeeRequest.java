package com.explore.dto.request;

import com.explore.domain.Employee;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Log4j2
@Validated
public class EmployeeRequest {
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;


}
