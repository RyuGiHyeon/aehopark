package aehopark.back.develop.item.dto;

import aehopark.back.develop.item.domain.Item;

public class ItemResponseDto {
    public static class PostItemDtoRes {

        Long itemId;

        public PostItemDtoRes(Item item){
            this.itemId = item.getItemId();
        }


    }
}