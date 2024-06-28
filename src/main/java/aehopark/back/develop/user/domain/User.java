package aehopark.back.develop.user.domain;

import aehopark.back.develop.common.domain.Region;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "User")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 50)
    private String password;

    @Column(nullable = false, length = 50)
    private String socialType;

    @ManyToOne
    @JoinColumn(name = "region", nullable = false)
    private Region region;

    @Column(nullable = false, length = 1, columnDefinition = "char(1) default 'x'")
    private char check = 'x';

    @Column(length = 50)
    private String pic;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @Column(nullable = false, length = 50)
    private String status;
}
