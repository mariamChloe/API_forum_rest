package com.example.API.REST.FORUM.Repository;

import com.example.API.REST.FORUM.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
