package com.imooc.entity.bo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
public class HeadLine {
    private long lineId;
    private String lineName;
    private String lineLink;
    private String lineImg;
    private int priority;
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;

    public static void main(String[] args) {
        HeadLine headLine = new HeadLine();
        System.out.println(headLine);
    }
}
