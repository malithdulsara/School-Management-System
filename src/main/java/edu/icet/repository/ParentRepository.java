package edu.icet.repository;

import edu.icet.entity.ParentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<ParentEntity,Integer> {
}
