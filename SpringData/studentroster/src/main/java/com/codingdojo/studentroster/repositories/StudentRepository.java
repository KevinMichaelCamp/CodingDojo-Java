package com.codingdojo.studentroster.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.studentroster.models.Student;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
 	List<Student> findAllByContactNullOrderByLastName();
	List<Student> findAllByDormitoryNullOrderByLastName();
}
