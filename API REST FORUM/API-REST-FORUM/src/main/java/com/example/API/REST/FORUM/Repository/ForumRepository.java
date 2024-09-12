package com.example.API.REST.FORUM.Repository;

import com.example.API.REST.FORUM.Model.Forum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForumRepository extends JpaRepository<Forum,Long> {
}
