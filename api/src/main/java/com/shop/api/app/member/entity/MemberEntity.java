package com.shop.api.app.member.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "MEMBER")
@Data
public class MemberEntity {
    @Id
    @GeneratedValue
    private Long uid;

    private String id;
    private String name;
}
