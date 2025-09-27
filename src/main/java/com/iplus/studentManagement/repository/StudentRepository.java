package com.iplus.studentManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.iplus.studentManagement.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Long> {

}
