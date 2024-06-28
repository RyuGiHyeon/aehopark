package aehopark.back.develop.item.dto;

import lombok.Getter;

public class ItemRequestDto {

    @Getter
    public static class PostItemDtoReq {

        // 상품명
        private String itemName;
        // 카테고리
        private Long categoryId;
        // 사진
        private String pic;
        // 가격
        private Long price;
        // 수량
        private int amount;

        private String status;
    }
}
