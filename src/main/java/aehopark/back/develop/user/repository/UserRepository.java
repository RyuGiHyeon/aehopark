package aehopark.back.develop.user.repository;

import aehopark.back.develop.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
