package com.ke.pojo;

public class Item {
    private Integer id;

    private String itemtitle;

    private String itemurl;

    private Integer viewtimes;

    private Integer sectionid;

    private String itemdescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemtitle() {
        return itemtitle;
    }

    public void setItemtitle(String itemtitle) {
        this.itemtitle = itemtitle == null ? null : itemtitle.trim();
    }

    public String getItemurl() {
        return itemurl;
    }

    public void setItemurl(String itemurl) {
        this.itemurl = itemurl == null ? null : itemurl.trim();
    }

    public Integer getViewtimes() {
        return viewtimes;
    }

    public void setViewtimes(Integer viewtimes) {
        this.viewtimes = viewtimes;
    }

    public Integer getSectionid() {
        return sectionid;
    }

    public void setSectionid(Integer sectionid) {
        this.sectionid = sectionid;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription == null ? null : itemdescription.trim();
    }
}