package jpabook.jpashop;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;



    @Test
    @Transactional
    void testMember() throws Exception{
        //given
        Member member = new Member();
        member.setName("memberA");
        //when
        Member save = memberRepository.save(member);
        //then
        Member findMember = memberRepository.findById(save.getId()).orElseThrow();
        assertEquals(member.getName(), findMember.getName());
    }




}