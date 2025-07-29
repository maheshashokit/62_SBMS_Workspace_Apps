package com.ashokit.repoistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.User;

public interface UserRespoistory extends JpaRepository<User, Long>{

}
