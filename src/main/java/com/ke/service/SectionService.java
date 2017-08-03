package com.ke.service;

import com.ke.pojo.Section;

import java.util.List;

/**
 * Created by Administrator on 2017/8/2.
 *
 * 一级版块Service
 */
public interface SectionService {

    /**
     * 获取所有一级版块信息
     * @return 一级版块集合
     */
    List<Section> getAllSection();


    /**
     * 添加一级版块
     * @return
     */
    int insertSection(Section section);

    int deleteSection(Section section);

    int updateByPrimaryKeySelective(Section section);

    int deleteSectionsByPrimaryKey(String[] items);

}
