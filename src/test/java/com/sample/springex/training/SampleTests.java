package com.sample.springex.training;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class) // Junit 5버전에서 테스트를 이용하기 위한 설정
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/root-context.xml") //스프링 설정파일 경로지정 설정을 자바로 했다면 classes 속성을 사용한다
public class SampleTests {

    @Autowired
    // Autowired 변수의 타입의 bean이 존재하면 의존성을 주입해라
    private SampleService sampleService;

    @Test
    public void testService() {
        log.info(sampleService);
        Assertions.assertNotNull(sampleService);
    }

}
