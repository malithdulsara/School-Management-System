package edu.icet.repository;

import edu.icet.entity.StudentAttendanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentAttendanceRepository extends JpaRepository<StudentAttendanceEntity,Integer> {
}
