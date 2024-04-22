package com.erlanda.tdddemo.kasir_resource;

import com.erlanda.tdddemo.kasir.KasirQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KasirQueryAdapter {

    private final KasirQueryService kasirQueryService;
    private final KasirQueryAdapterResponseMapper kasirQueryAdapterResponseMapper;

    public AllUserResponse getAllUser(){
        return kasirQueryAdapterResponseMapper.mapToAllUserResponse(kasirQueryService.getAllUser());
    }
}
