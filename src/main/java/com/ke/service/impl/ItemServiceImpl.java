package com.ke.service.impl;

import com.ke.mapper.ItemMapper;
import com.ke.pojo.Item;
import com.ke.pojo.ItemExample;
import com.ke.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/8/7.
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Resource
    private ItemMapper itemMapper;

    public List<Item> getAllItem() {
        return itemMapper.getAllItem();
    }

    public List<Item> getItemBySectionId(Integer SectionId) {

        ItemExample example = new ItemExample();

        example.createCriteria().andIdEqualTo(SectionId);

        return itemMapper.selectByExample(example);
    }
}
