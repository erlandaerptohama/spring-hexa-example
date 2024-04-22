package com.erlanda.tdddemo.kasir;

import com.erlanda.tdddemo.kasir_adapter.KasirQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KasirQueryServiceAdapter implements KasirQueryService {

    private final KasirQueryRepository kasirQueryRepository;

    @Override
    public List<User> getAllUser() {
        return kasirQueryRepository.getAllUser();
    }
}
