package com.example.warehouse_final.api.users;

import com.example.warehouse_final.dto.users.response.EmployeeResponse;
import com.example.warehouse_final.dto.users.response.ShiftResponse;
import com.example.warehouse_final.service.users.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/users/employee")
public class EmployeeController {

    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeResponse> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeResponse getShiftById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }
}
