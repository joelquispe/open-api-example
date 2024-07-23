package com.yoe.openapiexample.presentation;

import com.yoe.openapiexample.presentation.UserApiDelegate;
import com.yoe.openapiexample.presentation.views.User;
import com.yoe.openapiexample.domain.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Slf4j
@Component
@AllArgsConstructor
public class UsersApiDelegateImpl implements UserApiDelegate {

    private NativeWebRequest nativeWebRequest;


    @PostConstruct
    public void init() {
        System.out.println("UsersApiDelegateImpl initialized");
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(nativeWebRequest);
    }

    public void setNativeWebRequest(NativeWebRequest nativeWebRequest) {
        this.nativeWebRequest = nativeWebRequest;
    }

    @Override
    public ResponseEntity<com.yoe.openapiexample.presentation.views.User> getUserByName(String username) {
        System.out.println("get user");
        User userNew = new User();
        userNew.email("email");
        userNew.firstName("first name");

        return new ResponseEntity<>(userNew, HttpStatus.OK);

    }
}
