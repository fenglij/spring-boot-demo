package com.spring.boot.demo.service;

import com.spring.boot.demo.model.BUserEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface QuerydslService {

    List<BUserEntity> findQuerydslList();

    Page<BUserEntity> findQuerydslPage(Integer offSet, Integer pageSize);

    List<BUserEntity> findQuerydslNativeList();

    List<BUserEntity> findQuerydslJoinList();

}
