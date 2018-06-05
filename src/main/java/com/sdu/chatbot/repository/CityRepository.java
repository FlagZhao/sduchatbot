package com.sdu.chatbot.repository;

import com.sdu.chatbot.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, String> {
    City findByCname(String cname);
}
