package com.erlanda.tdddemo.kasir_adapter;

import com.erlanda.tdddemo.kasir.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class KasirQueryClientMapper {

    private static final int TRUE = 1;

    public List<User> mapToUserList(List<UserEntity> userEntities) {
        return userEntities.stream()
            .map(userEntity -> User.builder()
                .id(userEntity.getId())
                .name(userEntity.getName())
                .username(userEntity.getUsername())
                .role(userEntity.getRole())
                .isActive(userEntity.getIsActive() == TRUE)
                .build())
            .collect(Collectors.toList());
    }
}
