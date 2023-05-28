package com.liujian.gymxmjpa.dao;


import com.liujian.gymxmjpa.entity.Membertype;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: 会员卡类型信息Dao层接口
 */
public interface MemberttypeDao extends JpaRepository<Membertype,Long> {
}
