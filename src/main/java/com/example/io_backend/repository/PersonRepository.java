package com.example.io_backend.repository;

import com.example.io_backend.model.Person;
import com.example.io_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
