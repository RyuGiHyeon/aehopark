package aehopark.back.develop.common.repository;

import aehopark.back.develop.common.domain.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket, Long> {
}
