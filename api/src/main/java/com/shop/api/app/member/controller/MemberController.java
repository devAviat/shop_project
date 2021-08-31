package com.shop.api.app.member.controller;

import com.shop.api.app.member.domain.CreateMemberDomain;
import com.shop.api.app.member.domain.SearchMemberDomain;
import com.shop.api.app.member.domain.UpdateMemberDomain;
import com.shop.api.app.member.entity.MemberEntity;
import com.shop.api.app.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    /**
     * 회원조회
     *
     */
    @GetMapping("/v1/user")
    public String getMember(SearchMemberDomain searchMemberDomain) {
        log.info("entity :{} ", searchMemberDomain);
        return "test";
    }

    /**
     * 회원등록
     */
    @PostMapping("/v1/user")
    public MemberEntity createMember(CreateMemberDomain createMemberDomain) {
        MemberEntity entity = new MemberEntity();
        entity.setCreateMember(createMemberDomain);
        return memberRepository.save(entity);
    }


    /**
     * 회원수정
     */
    @PutMapping("/v1/user")
    public String updateMember(UpdateMemberDomain updateMemberDomain) {
        MemberEntity entity = new MemberEntity();
        entity.setUpdateMember(updateMemberDomain);

        return "test";
    }

    /**
     * 회원삭제
     */
    @DeleteMapping("/v1/user")
    public String deleteMember() {
        return "test";
    }
}
