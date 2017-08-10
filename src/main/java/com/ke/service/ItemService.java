package com.ke.service;

import com.ke.pojo.Item;

import java.util.List;

/**
 * Created by Administrator on 2017/8/7.
 */
public interface ItemService {

    List<Item> getAllItem();

    List<Item> getItemBySectionId(Integer SectionId);



}
