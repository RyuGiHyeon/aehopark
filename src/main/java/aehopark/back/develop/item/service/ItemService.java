package aehopark.back.develop.item.service;

import aehopark.back.develop.item.domain.Item;
import aehopark.back.develop.item.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public Optional<Item> findItem(Long id) {
        return itemRepository.findById(id);
    }

}
