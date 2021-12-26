package com.solvd.apitest;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url = "${base_url}/repos/kchernopiatova/testRepo", methodType = HttpMethodType.PATCH)
@RequestTemplatePath(path = "repo/patch/rq.json")
@ResponseTemplatePath(path = "repo/patch/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class RenameRepoMethod extends AbstractApiMethodV2 {

    public RenameRepoMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}