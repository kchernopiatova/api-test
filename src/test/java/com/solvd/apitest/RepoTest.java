package com.solvd.apitest;

import org.testng.annotations.Test;

public class RepoTest {

    @Test
    public void verifyRepoCreateTest() {
        CreateRepoMethod api = new CreateRepoMethod();
        api.setHeaders(String.format("Authorization=%s", "token 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"));
        api.setProperties("repo/repo.properties");
        api.callAPI();
    }
}
