package com.example.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, User>{
	
	@Query(value="select * from user where id=:id",nativeQuery = true)
	User findUserById(int id);
	
}