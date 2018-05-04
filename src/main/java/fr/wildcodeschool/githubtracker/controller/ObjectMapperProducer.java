package fr.wildcodeschool.githubtracker.controller;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

@Singleton
public class ObjectMapperProducer {

    @Produces
    @Singleton
    public ObjectMapper produceObjectMapper() {
        ObjectMapper om = new ObjectMapper()

                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return om;
    }
}
