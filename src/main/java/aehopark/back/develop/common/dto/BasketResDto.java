package aehopark.back.develop.common.dto;

import aehopark.back.develop.item.domain.Item;
import lombok.RequiredArgsConstructor;


public class BasketResDto {

    public static class PostDto {

        String name;
        Long price;
        String pic;
        Integer count;
        String region;


        private PostDto(Item item, Integer basketCount) {
            this.name = item.getItemName();
            this.price = item.getPrice();
            this.count = basketCount;
            this.pic = item.getPic();
        }
    }
}
