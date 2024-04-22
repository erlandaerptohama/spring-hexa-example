package com.erlanda.tdddemo.kasir_resource;

import com.erlanda.tdddemo.kasir.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class KasirQueryAdapterResponseMapper {

    public AllUserResponse mapToAllUserResponse(List<User> users) {

        return AllUserResponse.builder()
            .code(200)
            .data(users.stream()
                .map(user -> AllUserResponse.AllUserResponseData.builder()
                    .id(user.getId())
                    .name(user.getName())
                    .username(user.getUsername())
                    .role(user.getRole())
                    .isActive(user.isActive())
                    .build())
                .collect(Collectors.toList()))
            .build();
    }
}
