package com.erlanda.tdddemo.kasir_adapter;

import com.erlanda.tdddemo.kasir.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class KasirQueryClientAdapter implements KasirQueryRepository {

    private final UserRepository userRepository;
    private final KasirQueryClientMapper kasirQueryClientMapper;

    @Override
    public List<User> getAllUser() {
        return kasirQueryClientMapper.mapToUserList(userRepository.findAll());
    }
}
