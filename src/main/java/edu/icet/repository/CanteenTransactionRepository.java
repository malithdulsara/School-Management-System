package edu.icet.repository;

import edu.icet.entity.CanteenTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CanteenTransactionRepository extends JpaRepository<CanteenTransactionEntity,Integer> {
}
