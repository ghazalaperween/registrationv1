package com.registrationPrac.repositroy;

import com.registrationPrac.entity.RegistrationPrac;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationPracRepository extends JpaRepository<RegistrationPrac, Long> {
}