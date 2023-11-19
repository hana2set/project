package com.sparta.springresttemplateclient.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class KeysProperties{
    private final String naverClientId;
    private final String naverClientSecret;

    public KeysProperties(
            @Value("${naver.client.id}") String naverClientId,
            @Value("${naver.client.secret}") String naverClientSecret) {
        this.naverClientId = naverClientId;
        this.naverClientSecret = naverClientSecret;
    }
}
