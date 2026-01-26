package edu.icet.repository;

import edu.icet.entity.FeeCategoryEntity;
import edu.icet.entity.FeeStructureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeeCategoryRepository extends JpaRepository<FeeCategoryEntity,Integer> {
}
