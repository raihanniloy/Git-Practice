package com.dsi.starter.payroll_system.repos;

import com.dsi.starter.payroll_system.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
