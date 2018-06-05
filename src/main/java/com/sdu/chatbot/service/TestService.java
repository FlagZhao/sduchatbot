package com.sdu.chatbot.service;

import com.sdu.chatbot.entity.City;
import com.sdu.chatbot.model.Output;
import com.sdu.chatbot.model.city.CityOutput;
import com.sdu.chatbot.repository.CityRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import static com.sdu.chatbot.model.Output.output;

@Service
@Transactional
public class TestService {

    @Resource
    private CityRepository cityRepository;

    public String test(){
        return "success";
    }

    public Output<CityOutput> getCity(String cname)
    {
        City city = cityRepository.findByCname(cname);
        CityOutput output = new CityOutput().fromEntity(city);
        return output(output);
    }
}
