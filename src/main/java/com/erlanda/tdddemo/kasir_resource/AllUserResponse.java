package com.erlanda.tdddemo.kasir_resource;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class AllUserResponse {
    private Number code;
    private List<AllUserResponseData> data;

    @Getter
    @Setter
    @Builder
    public static class AllUserResponseData {
        private Number id;
        private String name;
        private String username;
        private Number role;
        private boolean isActive;
    }
}
