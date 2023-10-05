package net.didier.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.didier.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
    
}
