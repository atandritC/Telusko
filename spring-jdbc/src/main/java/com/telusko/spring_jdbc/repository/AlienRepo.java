package com.telusko.spring_jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.telusko.spring_jdbc.model.Alien;

@Repository
public class AlienRepo {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Alien alien) {

        String query = "insert into alien values(?,?,?)";
        jdbcTemplate.update(query, alien.getId(), alien.getName(), alien.getTech());                                                                    
    }

    public List<Alien> findAll() {
        
        String query = "select * from alien";
        return jdbcTemplate.query(query, (rs, rowNum) -> {
            Alien alien = new Alien();
            alien.setId(rs.getInt("id"));
            alien.setName(rs.getString("name"));
            alien.setTech(rs.getString("tech"));
            return alien;
        });
    }
}
