package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

//    // 1. 기본적으로  타입으로 검색, 연결 못하면 이름으로 검색
//    @Autowired
//    Food pizza;
//
//    @Autowired
//    Food chicken;

//    // 2. @Primary를 구현 객체에 두면 자동 주입
//    @Autowired
//    Food food;

    // 3. @Qualifier를 통해 직접 지정 가능. 우선순위 높음음
   @Autowired
    @Qualifier("pizza")
    Food food;


    @Test
    @DisplayName("테스트")
    void test() {
        food.eat();
    }

}
