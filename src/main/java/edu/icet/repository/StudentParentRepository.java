package edu.icet.repository;

import edu.icet.entity.StudentParentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentParentRepository extends JpaRepository<StudentParentEntity,Integer> {
}
