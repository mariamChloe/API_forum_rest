package com.example.API.REST.FORUM.Repositories;

import com.example.API.REST.FORUM.Model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
