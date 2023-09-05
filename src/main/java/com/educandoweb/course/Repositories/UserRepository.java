package com.educandoweb.course.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

/* @Repository -> não é necessário nesse caso, pois o UserRepository já está herdando essa anotação
   do JpaRepository. */
public interface UserRepository extends JpaRepository<User, Long>{

    

}