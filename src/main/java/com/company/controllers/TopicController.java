package com.company.controllers;

import com.company.topic.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic(1,"Spring Framework", "spring framework description" ),
                new Topic(1,"Erlang", "Erlang description" ),
                new Topic(1,"Java", "Java description" )
        );
    }
}
