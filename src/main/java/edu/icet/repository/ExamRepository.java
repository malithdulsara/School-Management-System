package edu.icet.repository;

import edu.icet.entity.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<ExamEntity,Integer> {
}
