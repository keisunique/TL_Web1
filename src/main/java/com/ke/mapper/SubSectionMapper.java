package com.ke.mapper;

import com.ke.pojo.SubSection;
import com.ke.pojo.SubSectionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface SubSectionMapper {
    int countByExample(SubSectionExample example);

    int deleteByExample(SubSectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SubSection record);

    int insertSelective(SubSection record);

    List<SubSection> selectByExampleWithBLOBs(SubSectionExample example);

    List<SubSection> selectByExample(SubSectionExample example);

    SubSection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SubSection record, @Param("example") SubSectionExample example);

    int updateByExampleWithBLOBs(@Param("record") SubSection record, @Param("example") SubSectionExample example);

    int updateByExample(@Param("record") SubSection record, @Param("example") SubSectionExample example);

    int updateByPrimaryKeySelective(SubSection record);

    int updateByPrimaryKeyWithBLOBs(SubSection record);

    int updateByPrimaryKey(SubSection record);

    List<SubSection> selectAllSubSection();
}