package com.ke.service.impl;

import com.ke.mapper.SectionMapper;
import com.ke.pojo.Section;
import com.ke.service.SectionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/8/2.
 *
 * 一级版块接口实现类
 */
@Service
public class SectionServiceImpl implements SectionService{

    @Resource
    private SectionMapper sectionMapper;

    public List<Section> getAllSection() {

        List<Section> sections = sectionMapper.selectAllSection();

        return sections;
    }

    public int insertSection(Section section) {

        return sectionMapper.insert(section);
    }

    public int deleteSection(Section section) {

        return sectionMapper.deleteByPrimaryKey(section.getId());
    }

    public int updateByPrimaryKeySelective(Section section) {
        return sectionMapper.updateByPrimaryKeySelective(section);
    }

    public int deleteSectionsByPrimaryKey(String[] items) {

        for (int i=0;i<items.length;i++) {
            int id = Integer.parseInt(items[i]);
            sectionMapper.deleteByPrimaryKey(id);
        }
        return items.length;
    }
}
