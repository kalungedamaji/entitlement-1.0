package com.learn.rest.entitlement10.repository;

import com.learn.rest.entitlement10.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
