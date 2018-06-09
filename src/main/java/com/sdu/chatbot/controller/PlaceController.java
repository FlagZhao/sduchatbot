package com.sdu.chatbot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceController {

    @PostMapping("place")
    public String place()
    {

        return "ds";
    }

    @PostMapping("placedetail")
    public String placedetail(){




        return "sdf";
    }
}
