package com.spring.boot.demo.service.impl;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.spring.boot.demo.model.BUserEntity;
import com.spring.boot.demo.model.QBUserEntity;
import com.spring.boot.demo.querydsl.UserRepositoryDls;
import com.spring.boot.demo.service.QuerydslService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class QuerydslServiceImpl implements QuerydslService {
    @Autowired
    private UserRepositoryDls repository;

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    private JPAQueryFactory queryFactory;

    @PostConstruct
    public void init(){
        queryFactory = new JPAQueryFactory(entityManager);
    }

    @Override
    public List<BUserEntity> findQuerydslPage() {
        QBUserEntity userEntity = QBUserEntity.bUserEntity;
        Predicate predicate = userEntity.account.like("test");
        Iterable<BUserEntity> it = repository.findAll(predicate);
        List<BUserEntity> list = Lists.newArrayList(it);
        return list;
    }
}
