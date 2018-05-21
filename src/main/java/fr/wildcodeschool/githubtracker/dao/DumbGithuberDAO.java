package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Dependent
public class DumbGithuberDAO implements GithuberDAO {
    private final static List<Githuber> githubers = new ArrayList<>(5);

    @Override
    public void deleteGithuber(String login) {
    }

    @Override
    public List<Githuber> getGithubers() {
        return Collections.unmodifiableList(githubers);
    }

    @Override
    public void saveGithuber(Githuber githuber) {
        githubers.add(githuber);
    }

}
