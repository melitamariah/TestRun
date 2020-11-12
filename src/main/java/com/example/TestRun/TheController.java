package com.example.TestRun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//controller class
@RestController
public class TheController {


    @GetMapping("/tester")
    public TheModel nyTimeStory() {

        //return new tester object
        return new TheModel("OK", "Copyright (c) 2020 The New York Times Company. All Rights Reserved.",
                "Arts","2020-11-11T14:39:48-05:00",34);
    }

    //@GetMapping("/tester")
    public Result topResults() {
        return new Result();
    }
}
