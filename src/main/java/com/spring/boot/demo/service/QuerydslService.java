package com.spring.boot.demo.service;

import com.spring.boot.demo.model.BUserEntity;

import java.util.List;

public interface QuerydslService {

    public List<BUserEntity> findQuerydslPage();
}
