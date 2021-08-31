package com.shop.api.app.member.domain;

import com.shop.api.app.member.entity.MemberEntity;
import lombok.Data;

@Data
public class UpdateMemberDomain {

    private String uid;
    private String id;
    private String name;
    private MemberEntity.MemberState state;
    private MemberEntity.MemberGrade grade;
}
