package com.py.property.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @ClassName WorkReport
 * @Author XuWeiZhi
 * @Description
 * @Date 2018-11-02 09:24 星期五 property
 * @VERSION 1.0.0
 **/
@Entity
@Data
public class WorkReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String message;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @OneToMany(cascade = CascadeType.ALL,fetch =FetchType.EAGER)
    private Set<ManageItem> items;

    public WorkReport() {
    }

    public WorkReport(String title, String message, Date createTime, Set<ManageItem> items) {
        this.title = title;
        this.message = message;
        this.createTime = createTime;
        this.items = items;
    }
}
