package com.example.study.repository;

import com.example.study.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {

    // JPA 메서드가 아님. (JpaRepository 인터페이스 상속받지 않음)
    List<Member> findByName(String name);

}
