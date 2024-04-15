package com.pokemonreview.api.dto;

import lombok.Data;

@Data
public class AuthResponseDto {
    private String accesstoken;
    private String tokenType = "Bearer";

    public AuthResponseDto(String token) {
        this.accesstoken = token;

    }
}
