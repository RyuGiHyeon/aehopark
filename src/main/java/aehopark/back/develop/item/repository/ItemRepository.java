package aehopark.back.develop.item.repository;

import aehopark.back.develop.item.domain.Item;
import aehopark.back.develop.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
