package com.shop.api.app.member.controller;

import com.shop.api.app.member.entity.MemberEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MemberController {

    @GetMapping("/v1/user")
    public String user(MemberEntity entity){
        log.info("entity :{} ", entity);


        return "test";
    }
}
