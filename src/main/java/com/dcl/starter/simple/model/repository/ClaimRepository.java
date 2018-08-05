package com.dcl.starter.simple.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.dcl.starter.simple.model.entity.Resource;


public interface ClaimRepository extends CrudRepository<Resource, Long> {
}
