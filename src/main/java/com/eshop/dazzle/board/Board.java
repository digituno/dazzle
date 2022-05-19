package com.eshop.dazzle.board;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Builder
    public Board(String title, String content) {
        Assert.notNull(title, "title is not null");
        Assert.notNull(content, "content is not null");
        this.title = title;
        this.content = content;
    }
}