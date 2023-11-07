package com.study.memo.service;

import com.study.memo.dto.MemoRequestDto;
import com.study.memo.dto.MemoResponseDto;
import com.study.memo.entity.Memo;
import com.study.memo.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemoService {

    private final MemoRepository memoRepository;

//    // @RequiredArgsConstructor 사용하면 안써도됨
//    public MemoService(MemoRepository memoRepository) {
//        this.memoRepository = memoRepository;
//    }

    // context로 구현하기
//    public MemoService(ApplicationContext context) {
////        MemoRepository memoReposiroty = (MemoRepository) context.getBean("MemoRepository");
//        MemoRepository memoReposiroty = (MemoRepository) context.getBean(MemoRepository.class);
//        this.memoRepository = memoReposiroty;
//    }

    public MemoResponseDto createMemo(MemoRequestDto requestDto) {
        // RequestDto -> Entity
        Memo memo = new Memo(requestDto);

        // DB 저장
        Memo saveMemo = memoRepository.save(memo);

        // Entity -> ResponseDto
        MemoResponseDto memoResponseDto = new MemoResponseDto(saveMemo);

        return memoResponseDto;
    }

    public List<MemoResponseDto> getMemos() {
        // DB 조회
        return memoRepository.findAll();
    }

    public Long updateMemo(Long id, MemoRequestDto requestDto) {
        // 해당 메모가 DB에 존재하는지 확인
        Memo memo = memoRepository.findById(id);
        if (memo != null) {
            // memo 내용 수정
            memoRepository.update(id, requestDto);

            return id;
        } else {
            throw new IllegalArgumentException("선택한 메모는 존재하지 않습니다.");
        }
    }

    public Long deleteMemo(Long id) {
        // 해당 메모가 DB에 존재하는지 확인
        Memo memo = memoRepository.findById(id);
        if (memo != null) {
            // memo 삭제
            memoRepository.delete(id);

            return id;
        } else {
            throw new IllegalArgumentException("선택한 메모는 존재하지 않습니다.");
        }
    }
}