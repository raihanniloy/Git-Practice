package com.dsi.starter.payroll_system.repos;

import com.dsi.starter.payroll_system.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
