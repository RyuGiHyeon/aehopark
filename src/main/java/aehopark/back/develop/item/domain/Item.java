package aehopark.back.develop.item.domain;

import aehopark.back.develop.common.domain.Category;
import aehopark.back.develop.item.dto.ItemResponseDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Builder
@Table(name = "Item")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @Column(nullable = false, length = 50)
    private String itemName;

    @ManyToOne(fetch = FetchType.LAZY) // ManyToOne 관계 설정
    @JoinColumn(name = "category_id", nullable = false)
    private Category category; // Category 객체로 변경

    @Column(length = 50)
    private String pic;

    @Column(nullable = false)
    private Long price;

    @Column(nullable = false, columnDefinition = "int default 0")
    private int amount;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @Column(nullable = false, length = 50)
    private String status;
}

