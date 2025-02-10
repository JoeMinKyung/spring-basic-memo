package com.example.basicmemo.dto;

import lombok.Getter;

@Getter
public class MemoResponseDto {
    private final long id;
    private final String content;

    public MemoResponseDto(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
