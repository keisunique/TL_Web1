package com.ke.pojo;

public class SubSection {
    private Integer id;

    private String sectionname;

    private Integer parentsection;

    private String sectiondescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname == null ? null : sectionname.trim();
    }

    public Integer getParentsection() {
        return parentsection;
    }

    public void setParentsection(Integer parentsection) {
        this.parentsection = parentsection;
    }

    public String getSectiondescription() {
        return sectiondescription;
    }

    public void setSectiondescription(String sectiondescription) {
        this.sectiondescription = sectiondescription == null ? null : sectiondescription.trim();
    }
}