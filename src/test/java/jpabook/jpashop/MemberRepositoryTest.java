package jpabook.jpashop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    void testMember() throws Exception{
        //given
        Member member = new Member();
        member.setUsername("memberA");
        //when
        Long savedId = memberRepository.save(member);
        //then
        Member findMember = memberRepository.findById(savedId);
        assertEquals(member.getUsername(), findMember.getUsername());
    }




}