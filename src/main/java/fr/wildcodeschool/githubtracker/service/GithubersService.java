package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.controller.GithubUtils;
import fr.wildcodeschool.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.dao.InJDBC;
import fr.wildcodeschool.githubtracker.dao.InMemory;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@SessionScoped
public class GithubersService implements Serializable {

    @Inject
    @InJDBC
    private GithuberDAO dao;

    @Inject
    private GithubUtils githubUtils;

    public List<Githuber> getGithubers() {
        return dao.getGithubers();
    }

    public Boolean track(String login) {
            dao.saveGithuber(githubUtils.parseGithuber(login));
            return true;
    }
    public void untrackGithuber(String login){
        dao.deleteGithuber(login);
    }
}