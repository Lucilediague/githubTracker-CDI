package fr.wildcodeschool.githubtracker.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.IOException;
import java.net.URL;

@ApplicationScoped
public class GithubUtils {

    @Inject
    private ObjectMapper om;

    public Githuber parseGithuber(String login) {

        try {
            return om.readValue(new URL("https://api.github.com/users/" + login), Githuber.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
