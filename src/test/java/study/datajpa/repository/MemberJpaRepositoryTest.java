package study.datajpa.repository;

import static org.junit.jupiter.api.Assertions.*;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import study.datajpa.entity.Member;

@SpringBootTest
@RequiredArgsConstructor
class MemberJpaRepositoryTest {

    private final MemberJpaRepository memberJpaRepository;

    @Test
    void testMember() {
        Member member = new Member();
        member.setName("kim");
        Member result = memberJpaRepository.save(member);
    }
}