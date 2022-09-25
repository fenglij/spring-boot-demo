package com.spring.boot.demo.service;

import com.spring.boot.demo.model.TUserEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface QuerydslService {

    List<TUserEntity> findQuerydslList();

    Page<TUserEntity> findQuerydslPage(Integer offSet, Integer pageSize);

    List<TUserEntity> findQuerydslNativeList();

    List<TUserEntity> findQuerydslJoinList();

}
