package com.py.property.repository;

import com.py.property.entity.Advice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName AdviceDao
 * @Author XuWeiZhi
 * @Description
 * @Date 2018-11-02 16:54 星期五 property
 * @VERSION 1.0.0
 **/
@Repository
public interface AdviceDao extends JpaRepository<Advice,Integer> {
}
