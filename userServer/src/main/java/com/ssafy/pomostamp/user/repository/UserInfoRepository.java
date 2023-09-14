package com.ssafy.pomostamp.user.repository;

import com.ssafy.pomostamp.user.dto.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;


public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

    UserInfo findByUserId(String userId);

    @Transactional
    UserInfo getOne(String userId);
}
