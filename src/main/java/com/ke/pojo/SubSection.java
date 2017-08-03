package com.ke.pojo;

public class SubSection {
    private Integer id;

    private String sectionName;

    private Integer parentSection;

    private String sectionDescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

    public Integer getParentSection() {
        return parentSection;
    }

    public void setParentSection(Integer parentSection) {
        this.parentSection = parentSection;
    }

    public String getSectionDescription() {
        return sectionDescription;
    }

    public void setSectionDescription(String sectionDescription) {
        this.sectionDescription = sectionDescription == null ? null : sectionDescription.trim();
    }
}