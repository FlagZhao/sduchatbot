package com.sdu.chatbot.model.city;


import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class CityInput {
    String cname;
}