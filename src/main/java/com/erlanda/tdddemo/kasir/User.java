package com.erlanda.tdddemo.kasir;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {
    private Number id;
    private String name;
    private String username;
    private Number role;
    private boolean isActive;
}
