package edu.icet.repository;

import edu.icet.entity.TimetableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimetableRepository extends JpaRepository<TimetableEntity,Integer> {
}
