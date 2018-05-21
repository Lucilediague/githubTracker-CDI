package fr.wildcodeschool.githubtracker.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Githuber {
    private long id;
    private String name;
    private String login;
    private String url;
    private String email;
    private String bio;
    private String location;
    private String avatarUrl;


    @JsonCreator
    public Githuber(@JsonProperty("id") Long id, @JsonProperty("name") String name, @JsonProperty("login") String login, @JsonProperty("url") String url, @JsonProperty("email") String email, @JsonProperty("bio") String bio, @JsonProperty("location") String location, @JsonProperty("avatar_url") String avatarUrl) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.url = url;
        this.email = email;
        this.bio = bio;
        this.location = location;
        this.avatarUrl = avatarUrl;
    }

    public Githuber(){}
}