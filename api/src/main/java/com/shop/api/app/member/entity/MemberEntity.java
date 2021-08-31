package com.shop.api.app.member.entity;

import com.shop.api.app.member.domain.CreateMemberDomain;
import com.shop.api.app.member.domain.UpdateMemberDomain;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static com.shop.api.app.member.entity.MemberEntity.MemberGrade.*;
import static com.shop.api.app.member.entity.MemberEntity.MemberState.*;

@Entity(name = "MEMBER")
@Data
public class MemberEntity {

    @Id
    @GeneratedValue
    private Long member_id;
    private String uid;

    private String id;
    private String name;

    private MemberState state;
    private MemberGrade grade;


    public enum MemberState {
        SLEEP,USE
    }

    public enum MemberGrade {
        LEV1, LEV2, LEV3
    }

    public void setCreateMember(CreateMemberDomain domain){
        this.setUid(domain.getUid());
        this.setName(domain.getName());
        this.setState(SLEEP);
        this.setGrade(LEV1);
    }

    public void setUpdateMember(UpdateMemberDomain domain) {
        this.setName(domain.getName());
        this.setGrade(domain.getGrade());
        this.setState(domain.getState());
    }
}
