package com.spring.boot.demo.querydsl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @NoRepositoryBean 避免SpringDataJPA自动实例化,
 * 否则报Bean: baseJpaRepository 不存在
 * @param <T>
 */
@NoRepositoryBean
public interface BaseJpaRepository<T> extends JpaRepository<T, String>,
        JpaSpecificationExecutor<T>,
        QuerydslPredicateExecutor<T> {
}
