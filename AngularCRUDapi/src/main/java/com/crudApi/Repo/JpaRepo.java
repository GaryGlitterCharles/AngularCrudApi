package com.crudApi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudApi.Domain.UserForm;

public interface JpaRepo extends JpaRepository<UserForm, Integer>{

}
