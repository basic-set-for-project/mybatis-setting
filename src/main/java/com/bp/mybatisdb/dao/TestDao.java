package com.bp.mybatisdb.dao;

import com.bp.mybatisdb.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


//보통 repository로 줌
@Mapper
public interface TestDao {
    //mapper를 호출하는 방식
    List<TestDto> getUserList();

}
