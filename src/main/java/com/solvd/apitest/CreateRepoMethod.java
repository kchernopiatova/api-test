package com.solvd.apitest;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

@Endpoint(url = "${base_url}/user/repos", methodType = HttpMethodType.POST)
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
@RequestTemplatePath(path = "repo/rq.json")

public class CreateRepoMethod extends AbstractApiMethodV2 {

    public CreateRepoMethod(String rqPath, String rsPath, Properties properties) {
        super(rqPath, rsPath, properties);
    }

    public CreateRepoMethod() {

        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
