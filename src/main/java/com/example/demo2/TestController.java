package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author tian
 * @Date 2020/7/15 9:36
 * @Version 1.0
 */
@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping("/test")
    String test() {
        return "2";
    }
}
