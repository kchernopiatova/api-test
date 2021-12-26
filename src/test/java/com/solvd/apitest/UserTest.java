package com.solvd.apitest;

import org.testng.annotations.Test;

public class UserTest {

    @Test
    public void verifyAuthorizedUser() {
        GetAuthorizedUserMethod api = new GetAuthorizedUserMethod();
        api.setHeaders(String.format("Authorization=%s", "token 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"));
        api.callAPI();
        api.validateResponseAgainstSchema("user/rs.schema");
        api.validateResponse();
    }
}