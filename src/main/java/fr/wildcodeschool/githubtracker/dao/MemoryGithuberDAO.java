package fr.wildcodeschool.githubtracker.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.wildcodeschool.githubtracker.controller.GithubUtils;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.*;

@InMemory
@ApplicationScoped
public class MemoryGithuberDAO implements GithuberDAO, Serializable {

    @Inject
    private GithubUtils githubUtils;

    @Inject
    private ObjectMapper om;


    HashMap<String, Githuber> githubers = new HashMap<String, Githuber>();

    @Override
    public List<Githuber> getGithubers() {
        return new ArrayList<>(githubers.values());
    }

    @Override
    public void saveGithuber(Githuber githuber){
            githubers.put(githuber.getLogin(), githuber);
    }

    @Override
    public void deleteGithuber(String login) { }

}
