package com.iplus.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.iplus.studentManagement.entity.UserEntity;

public interface UserEntityRepository extends JpaRepository<UserEntity,Long>{

}
