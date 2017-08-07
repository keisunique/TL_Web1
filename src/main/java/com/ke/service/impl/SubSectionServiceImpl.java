package com.ke.service.impl;

import com.ke.mapper.SectionMapper;
import com.ke.mapper.SubSectionMapper;
import com.ke.pojo.Section;
import com.ke.pojo.SubSection;
import com.ke.service.SubSectionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/7.
 */
@Service
public class SubSectionServiceImpl implements SubSectionService{

    @Resource
    private SubSectionMapper subSectionMapper;

    @Resource
    private SectionMapper sectionMapper;

    public List<SubSection> getAllSubSection() {
        return subSectionMapper.selectAllSubSection();
    }

    public HashMap<Integer, String> getParentSecName(List<SubSection> subSections) {

        HashMap<Integer, String> pSecNameMap = new HashMap<Integer, String>();

        for (SubSection s: subSections) {
            pSecNameMap.put(s.getParentsection(),
                    sectionMapper.selectByPrimaryKey(s.getParentsection()).getSectionName());
        }
        return pSecNameMap;
    }

    public int insertSubSection(SubSection subSection) {
        return subSectionMapper.insert(subSection);
    }

    public int deleteSubSection(SubSection subSection) {
        return subSectionMapper.deleteByPrimaryKey(subSection.getId());
    }

    public int updateSubSection(SubSection subSection) {
        return subSectionMapper.updateByPrimaryKeySelective(subSection);
    }
}
