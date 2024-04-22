package com.erlanda.tdddemo.spring;

import com.erlanda.tdddemo.kasir.KasirQueryService;
import com.erlanda.tdddemo.kasir.KasirQueryServiceAdapter;
import com.erlanda.tdddemo.kasir_adapter.KasirQueryClientAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KasirConfig {

    @Autowired
    private KasirQueryClientAdapter kasirQueryClientAdapter;

    @Bean
    public KasirQueryService kasirQueryService() {
        return new KasirQueryServiceAdapter(kasirQueryClientAdapter);
    }
}
