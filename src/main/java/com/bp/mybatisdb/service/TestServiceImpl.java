package com.bp.mybatisdb.service;

import com.bp.mybatisdb.dao.TestDao;
import com.bp.mybatisdb.dto.TestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestDao testDao;

    @Override
    public List<TestDto> getUserList() {
        return testDao.getUserList();
    }
}
