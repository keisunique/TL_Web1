package com.ke.service;

import com.ke.pojo.SubSection;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/7.
 */
public interface SubSectionService {

    List<SubSection> getAllSubSection();

    HashMap<Integer,String> getParentSecName(List<SubSection> subSections);

    int insertSubSection(SubSection subSection);

    int deleteSubSection(SubSection subSection);

    int updateSubSection(SubSection subSection);

}
