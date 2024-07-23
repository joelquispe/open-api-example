package com.yoe.openapiexample.presentation;

import com.openapi.gen.springboot.api.UserApiDelegate;
import com.openapi.gen.springboot.dto.User;
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

    @Autowired
    private UserService userService;

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
    public ResponseEntity<User> getUserByName(String username) {
        System.out.println("get user");
        User userNew = new User();
        userNew.email("email");
        userNew.firstName("first name");
        userService.createUser();
        return new ResponseEntity<>(userNew, HttpStatus.OK);

    }
}
