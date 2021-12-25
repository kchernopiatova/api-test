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
