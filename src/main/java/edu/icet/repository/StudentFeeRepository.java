package edu.icet.repository;

import edu.icet.entity.StudentFeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentFeeRepository extends JpaRepository<StudentFeeEntity,Integer> {
}
