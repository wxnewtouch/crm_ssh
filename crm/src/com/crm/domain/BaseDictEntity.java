package com.crm.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "base_dict", schema = "crm_ssh")
public class BaseDictEntity {
    private long dictId;
    private String dictTypeCode;
    private String dictTypeName;
    private String dictItemName;
    private String dictItemCode;
    private Integer dictSort;
    private String dictEnable;
    private String dictMemo;

    @Id
    @Column(name = "dict_id")
    public long getDictId() {
        return dictId;
    }

    public void setDictId(long dictId) {
        this.dictId = dictId;
    }

    @Basic
    @Column(name = "dict_type_code")
    public String getDictTypeCode() {
        return dictTypeCode;
    }

    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode;
    }

    @Basic
    @Column(name = "dict_type_name")
    public String getDictTypeName() {
        return dictTypeName;
    }

    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName;
    }

    @Basic
    @Column(name = "dict_item_name")
    public String getDictItemName() {
        return dictItemName;
    }

    public void setDictItemName(String dictItemName) {
        this.dictItemName = dictItemName;
    }

    @Basic
    @Column(name = "dict_item_code")
    public String getDictItemCode() {
        return dictItemCode;
    }

    public void setDictItemCode(String dictItemCode) {
        this.dictItemCode = dictItemCode;
    }

    @Basic
    @Column(name = "dict_sort")
    public Integer getDictSort() {
        return dictSort;
    }

    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }

    @Basic
    @Column(name = "dict_enable")
    public String getDictEnable() {
        return dictEnable;
    }

    public void setDictEnable(String dictEnable) {
        this.dictEnable = dictEnable;
    }

    @Basic
    @Column(name = "dict_memo")
    public String getDictMemo() {
        return dictMemo;
    }

    public void setDictMemo(String dictMemo) {
        this.dictMemo = dictMemo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseDictEntity that = (BaseDictEntity) o;
        return dictId == that.dictId &&
                Objects.equals(dictTypeCode, that.dictTypeCode) &&
                Objects.equals(dictTypeName, that.dictTypeName) &&
                Objects.equals(dictItemName, that.dictItemName) &&
                Objects.equals(dictItemCode, that.dictItemCode) &&
                Objects.equals(dictSort, that.dictSort) &&
                Objects.equals(dictEnable, that.dictEnable) &&
                Objects.equals(dictMemo, that.dictMemo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(dictId, dictTypeCode, dictTypeName, dictItemName, dictItemCode, dictSort, dictEnable, dictMemo);
    }
}
