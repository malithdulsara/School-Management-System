package edu.icet.repository;

import edu.icet.entity.TermEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TermRepository extends JpaRepository<TermEntity,Integer> {
}
