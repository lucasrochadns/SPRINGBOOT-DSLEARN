package com.devsuperior.capitulo23.repositories;


import com.devsuperior.capitulo23.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
