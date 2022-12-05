package com.bp.mybatisdb.controller;

import com.bp.mybatisdb.dto.TestDto;
import com.bp.mybatisdb.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping(value = "/get")
    public List<TestDto> getUser() {
        return testService.getUserList();
    }
}
