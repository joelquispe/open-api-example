package com.yoe.openapiexample.presentation;

import com.openapi.gen.springboot.api.UserApiController;
import com.openapi.gen.springboot.api.UserApiDelegate;

public class UserControllerImpl extends UserApiController {

    public UserControllerImpl(UserApiDelegate delegate) {
        super(delegate);
    }
}
