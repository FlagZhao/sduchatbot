package com.sdu.chatbot.model.city;

import com.sdu.chatbot.entity.City;
import com.sdu.chatbot.model.ModelFromEntity;

public class CityOutput  implements ModelFromEntity<City, CityOutput> {

    private String cname;
    @Override
    public CityOutput fromEntity(City city) {
        cname = city.getCname();
        return this;
    }
}
