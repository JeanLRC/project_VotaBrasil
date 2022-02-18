package com.votabrasil.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.votabrasil.app.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>{

}