package com.shop.api.app.member.controller;

import com.shop.api.app.member.entity.MemberEntity;
import com.shop.api.app.member.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@Slf4j
class MemberControllerTest {

    @Autowired
    private MemberRepository memberRepository;

    /**
     * 등록 테스트
     */
    @Test
    public void memberTest(){
        MemberEntity entity = new MemberEntity();
        entity.setId("min1234");
        entity.setUid("minUid");
        entity.setGrade(MemberEntity.MemberGrade.LEV1);
        entity.setState(MemberEntity.MemberState.SLEEP);
        entity.setName("min");
        log.info("entity : {}", entity);

        MemberEntity saveEntity = memberRepository.save(entity);
        log.info("saveEntity : {}", saveEntity);
    }

    /**
     * 전체 조회 테스트
     */
    @Test
    public void memberReadTest(){
        List<MemberEntity> listEntity = memberRepository.findAll();
        log.info("entity : {}", listEntity);
    }


    @Test
    public void setMemberUpdate(){

    }
}