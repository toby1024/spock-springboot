package com.example.base

import com.example.spockspringboot.SpockSpringbootApplication
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

@Transactional
@Rollback
@SpringBootTest(classes = SpockSpringbootApplication.class)
class BaseBootTest extends Specification {
    void setup() {

    }
}
