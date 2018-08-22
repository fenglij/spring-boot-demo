package com.spring.boot.demo.querydsl;

import com.spring.boot.demo.model.BUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface UserRepositoryDls extends JpaRepository<BUserEntity, String>, QuerydslPredicateExecutor<BUserEntity> {
}
