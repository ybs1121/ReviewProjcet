package com.example.reviewprojcet.repository;

import com.example.reviewprojcet.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long> {

    @Query(value = "SELECT * FROM Member  WHERE id = :id",
            nativeQuery = true)
    List<Member> findByMemberId(String id);

    @Query(value = "SELECT * FROM Member  WHERE id = :id AND password = :password",
            nativeQuery = true)
    List<Member> findByMemberIdPassword(String id,String password);
}
