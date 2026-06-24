package com.example.demo.repository;

import com.example.demo.model.Message;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {

    private final JdbcTemplate jdbcTemplate;

    public MessageRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Message message) {

        String sql =
                "INSERT INTO messages(content, date_received) VALUES (?, ?)";

        jdbcTemplate.update(
                sql,
                message.getContent(),
                message.getDateReceived()
        );
    }
}
