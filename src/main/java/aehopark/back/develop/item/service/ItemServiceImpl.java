package aehopark.back.develop.item.service;

import aehopark.back.develop.item.convertor.ItemConverter;
import aehopark.back.develop.item.domain.Item;
import aehopark.back.develop.item.dto.ItemRequestDto;
import aehopark.back.develop.item.repository.ItemRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemConverter itemConverter;


    @Override
    public Item joinItem(ItemRequestDto.PostItemDtoReq request) {

        return itemRepository.save(itemConverter.postDtoToItem(request));
    }
}


