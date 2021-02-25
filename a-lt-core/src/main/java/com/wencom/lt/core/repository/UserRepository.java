package com.wencom.lt.core.repository;

import com.wencom.lt.core.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    @Modifying
    @Transactional(propagation = Propagation.REQUIRED)
    @Query(value = "update auth_user set (age, name, sex) = (:age, :name, :sex) where id = :userId", nativeQuery = true)
    void updateUserById(@Param("age") Integer age, @Param("name") String name, @Param("sex") Integer sex, @Param("userId") Long id);
}
