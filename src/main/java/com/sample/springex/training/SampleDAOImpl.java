package com.sample.springex.training;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary //레포지토리 어노테이션을 2개 이상 사용했다면 어노테이션을 사용해 현재 사용하는 레포지토리를 지정할 수 있다.
         // lombok의 qualifier 어노테이션을 사용해서도 지정할 수 있다.
public class SampleDAOImpl implements SampleDAO {

}
