package com.ns.domain;

import java.io.Serializable;

/**
 * 会员收藏的专题活动
 * @TableName ums_member_collect_subject
 */
public class UmsMemberCollectSubject implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * subject_id
     */
    private Long subjectId;

    /**
     * subject_name
     */
    private String subjectName;

    /**
     * subject_img
     */
    private String subjectImg;

    /**
     * 活动url
     */
    private String subjectUrll;

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * subject_id
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * subject_id
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * subject_name
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * subject_name
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     * subject_img
     */
    public String getSubjectImg() {
        return subjectImg;
    }

    /**
     * subject_img
     */
    public void setSubjectImg(String subjectImg) {
        this.subjectImg = subjectImg;
    }

    /**
     * 活动url
     */
    public String getSubjectUrll() {
        return subjectUrll;
    }

    /**
     * 活动url
     */
    public void setSubjectUrll(String subjectUrll) {
        this.subjectUrll = subjectUrll;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UmsMemberCollectSubject other = (UmsMemberCollectSubject) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSubjectId() == null ? other.getSubjectId() == null : this.getSubjectId().equals(other.getSubjectId()))
            && (this.getSubjectName() == null ? other.getSubjectName() == null : this.getSubjectName().equals(other.getSubjectName()))
            && (this.getSubjectImg() == null ? other.getSubjectImg() == null : this.getSubjectImg().equals(other.getSubjectImg()))
            && (this.getSubjectUrll() == null ? other.getSubjectUrll() == null : this.getSubjectUrll().equals(other.getSubjectUrll()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSubjectId() == null) ? 0 : getSubjectId().hashCode());
        result = prime * result + ((getSubjectName() == null) ? 0 : getSubjectName().hashCode());
        result = prime * result + ((getSubjectImg() == null) ? 0 : getSubjectImg().hashCode());
        result = prime * result + ((getSubjectUrll() == null) ? 0 : getSubjectUrll().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", subjectName=").append(subjectName);
        sb.append(", subjectImg=").append(subjectImg);
        sb.append(", subjectUrll=").append(subjectUrll);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}