package com.example.demo.data.inf;

import com.example.demo.data.model.SimpleUser;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "simple-users", path = "simple-users")
public interface SimpleUserInterface
    extends PagingAndSortingRepository<SimpleUser, Long>
{}