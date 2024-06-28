package aehopark.back.develop.common.repository;

import aehopark.back.develop.common.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
