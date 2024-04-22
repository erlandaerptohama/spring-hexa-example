package com.erlanda.tdddemo.kasir_resource;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class KasirQueryController {

    private final KasirQueryAdapter kasirQueryAdapter;

    @GetMapping(path = "/user")
    public @ResponseBody AllUserResponse getAllUser() {

        return kasirQueryAdapter.getAllUser();
    }
}
