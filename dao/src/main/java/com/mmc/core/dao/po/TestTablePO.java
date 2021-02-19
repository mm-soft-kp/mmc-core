package com.mmc.core.dao.po;

import java.io.Serializable;
import java.util.Date;

public class TestTablePO implements Serializable {
    private Integer runoobId;

    private String runoobTitle;

    private String runoobAuthor;

    private Date submissionDate;

    private static final long serialVersionUID = 1L;

    public Integer getRunoobId() {
        return runoobId;
    }

    public void setRunoobId(Integer runoobId) {
        this.runoobId = runoobId;
    }

    public String getRunoobTitle() {
        return runoobTitle;
    }

    public void setRunoobTitle(String runoobTitle) {
        this.runoobTitle = runoobTitle == null ? null : runoobTitle.trim();
    }

    public String getRunoobAuthor() {
        return runoobAuthor;
    }

    public void setRunoobAuthor(String runoobAuthor) {
        this.runoobAuthor = runoobAuthor == null ? null : runoobAuthor.trim();
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }
}