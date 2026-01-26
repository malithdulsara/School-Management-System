package edu.icet.repository;

import edu.icet.entity.CanteenItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CanteenItemRepository extends JpaRepository<CanteenItemEntity,Integer> {
}
