package aehopark.back.develop.item.domain;

import aehopark.back.develop.common.domain.Category;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "Item")
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @Column(nullable = false, length = 50)
    private String itemName;

    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;

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
