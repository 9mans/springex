package com.sample.springex.training;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ToString
@RequiredArgsConstructor
public class SampleService {

    // 생성자 주입 방식으로 의존성을 추가
    private final SampleDAO sampleDAO;
}
