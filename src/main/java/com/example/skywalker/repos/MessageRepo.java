package com.example.skywalker.repos;

import com.example.skywalker.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {
}
