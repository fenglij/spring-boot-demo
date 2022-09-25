package com.spring.boot.demo.service.impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.spring.boot.demo.model.TUserEntity;
//import com.spring.boot.demo.model.QBUserEntity;
import com.spring.boot.demo.querydsl.TUserJpaRepository;
import com.spring.boot.demo.service.QuerydslService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class QuerydslServiceImpl implements QuerydslService {
    @Autowired
    private TUserJpaRepository repository;

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    private JPAQueryFactory queryFactory;

    @PostConstruct
    public void init(){
        queryFactory = new JPAQueryFactory(entityManager);
    }

    @Override
    public List<TUserEntity> findQuerydslList() {
        // 查询方式一：SpringDataJPA整合QueryDSL风格
        /*QBUserEntity userEntity = QBUserEntity.bUserEntity;
        Predicate predicate = userEntity.account.like("%test%");
        Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, "account"));
        Iterable<BUserEntity> it = repository.findAll(predicate, sort);
        List<BUserEntity> list = Lists.newArrayList(it);*/

        // 查询方式二：完全QueryDSL风格
        /*QBUserEntity userEntity = QBUserEntity.bUserEntity;
        Predicate predicate = userEntity.account.like("%test%");
        OrderSpecifier orderBy = userEntity.account.desc();
        List<BUserEntity> list = queryFactory.selectFrom(userEntity)
                .where(predicate)
                .groupBy(userEntity.account)
                .orderBy(orderBy)
                .fetch();

        return list;*/

        return null;
    }

    @Override
    public Page<TUserEntity> findQuerydslPage(Integer offSet, Integer pageSize) {
        /*QBUserEntity userEntity = QBUserEntity.bUserEntity;
        Predicate predicate = userEntity.account.like("%test%");
        Sort sort = new Sort(new Sort.Order(Sort.Direction.DESC, "account"));
        Pageable pageable = new PageRequest(offSet, pageSize, sort);
        Page<BUserEntity> page = repository.findAll(predicate, pageable);
        return page;*/
        return null;
    }

    @Override
    public List<TUserEntity> findQuerydslNativeList() {
        /*QBUserEntity userEntity = QBUserEntity.bUserEntity;
        Predicate predicate = userEntity.account.like("%test%");
        Query query = queryFactory.selectFrom(userEntity)
                .where(predicate).createQuery();
        return query.getResultList();*/
        return null;
    }

    @Override
    public List<TUserEntity> findQuerydslJoinList() {
        /*QBUserEntity userEntity = QBUserEntity.bUserEntity;
        QBUserEntity userEntityTmp = new QBUserEntity("userEntityTmp");
        Predicate predicate = userEntity.account.like("%test%");
        List<BUserEntity> list = queryFactory.selectFrom(userEntity)
                .innerJoin(userEntityTmp)
                .on(userEntity.account.stringValue().eq(userEntityTmp.account.stringValue()))
                .where(predicate)
                .fetch();
        return list;*/
        return null;
    }
}
