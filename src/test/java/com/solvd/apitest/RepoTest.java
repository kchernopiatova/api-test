package com.solvd.apitest;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class RepoTest {

    @Test(priority = 0)
    public void verifyPostRepoTest() {
        CreateRepoMethod api = new CreateRepoMethod();
        api.setHeaders(String.format("Authorization=%s", "token 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"));
        api.setProperties("repo/post/repo.properties");
        api.callAPI();
    }

    @Test
    public void verifyGetRepoTest() {
        GetRepoMethod api = new GetRepoMethod();
        api.callAPI();
        api.validateResponse();
    }

    @Test(priority = 1)
    public void verifyPatchRepoTest() {
        RenameRepoMethod api = new RenameRepoMethod();
        api.setHeaders(String.format("Authorization=%s", "token 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"));
        api.callAPI();
        api.validateResponseAgainstSchema("repo/patch/rs.schema");
    }

    @Test(priority = 2)
    public void verifyDeleteRepoTest() {
        DeleteRepoMethod api = new DeleteRepoMethod();
        api.setHeaders(String.format("Authorization=%s", "token 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"));
        api.callAPI();
        api.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
    }
}