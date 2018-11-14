package com.py.property.repository;


import com.py.property.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName ComplaintDao
 * @Author XuWeiZhi
 * @Description
 * @Date 2018-11-02 16:56 星期五 property
 * @VERSION 1.0.0
 **/
@Repository
public interface ComplaintDao extends JpaRepository<Complaint,Integer> {
}
