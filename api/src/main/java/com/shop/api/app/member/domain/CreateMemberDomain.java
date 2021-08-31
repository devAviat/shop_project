package com.shop.api.app.member.domain;

import com.shop.api.app.member.entity.MemberEntity.MemberGrade;
import com.shop.api.app.member.entity.MemberEntity.MemberState;
import lombok.Data;


@Data
public class CreateMemberDomain {

    private String uid;
    private String id;
    private String name;
    private MemberState state;
    private MemberGrade grade;
}
