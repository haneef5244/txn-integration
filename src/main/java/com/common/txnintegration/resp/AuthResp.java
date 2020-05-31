package com.common.txnintegration.resp;

import lombok.Data;

@Data
public class AuthResp {
    String access_token;
    String token_type;
    String refresh_token;
    int expires_in;
    String scope;
}
