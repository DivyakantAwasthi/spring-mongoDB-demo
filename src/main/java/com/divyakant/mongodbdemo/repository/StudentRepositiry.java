package com.divyakant.mongodbdemo.repository;

import com.divyakant.mongodbdemo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositiry extends MongoRepository<Student, Integer> {
}
