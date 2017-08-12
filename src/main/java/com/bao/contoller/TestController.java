package com.bao.contoller;

import com.alibaba.fastjson.JSON;
import com.bao.mapper.TOrderMapper;
import com.bao.model.TOrder;
import com.bao.model.TestDomain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

/**
 * Created by baochunyu on 2017/8/12.
 */
@Slf4j
@Controller
public class TestController {

//    @GetMapping(value = "/test")
//    public TestDomain test(){
//        return TestDomain.builder().id("123").name("name").build();
//    }

    @Autowired
    TOrderMapper tOrderMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @GetMapping
    public String welcome(Map<String, Object> model) {
        log.info("welcome start ");

//        tOrderMapper.insert()
        String value = stringRedisTemplate.opsForValue().get("key-redis");

        TestDomain domain = TestDomain.builder().id("123").name("name").date(new Date()).build();
        log.info(JSON.toJSONString(domain));
        return "send";
    }
}
