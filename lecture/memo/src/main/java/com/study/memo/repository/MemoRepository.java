package com.study.memo.repository;

import com.study.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// 실제로는 @Respository가 포함되어 구현되어있는 SimpleJpaRepository를 인젝션함.
// transaction도 걸려있음
public interface MemoRepository extends JpaRepository<Memo, Long> {
    // Query method - 이름만으로 구현가능.
    // 참조 : https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-creation

    // modifiedAt 기준으로 내림차순 정렬 조회 -> findAllByOrderByModifiedAtDesc
    List<Memo> findAllByOrderByModifiedAtDesc();

    // username으로 검색
    List<Memo> findAllByUsername(String username);

    List<Memo> findAllByContentsContainsOrderByModifiedAtDesc(String keyword);
}
