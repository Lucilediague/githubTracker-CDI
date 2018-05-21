package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.sql.DataSource;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

@InJDBC
@ApplicationScoped
public class jdbcDAO implements GithuberDAO {

    private Connection conn = null;
    private Statement stmt = null;

    @Resource(lookup = "jdbc/githubtracker")
    private DataSource datasource;

    @PostConstruct
    public void postConstruct() {
        try {
            conn = datasource.getConnection();
        }
        catch (SQLException e) { e.printStackTrace(); }
    }

    public void saveGithuber(Githuber githuber){
        String statement = "INSERT INTO githuber(github_id,name,login,url,email,bio,location,avatar_url) VALUES('"
                + githuber.getId() + "','" + githuber.getName() + "', '" + githuber.getLogin() + "','" + githuber.getUrl() +
                "','" + githuber.getEmail() + "','" + githuber.getBio() + "','" + githuber.getLocation() + "','" + githuber.getAvatarUrl() + "')";

        PreparedStatement insertStatement = null;
        try {
            insertStatement = conn.prepareStatement(statement);
            insertStatement.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public List<Githuber> getGithubers() {

        List<Githuber> githubers = new LinkedList<>();
        try {
            stmt = conn.createStatement();
            ResultSet resultat = null;
            resultat = stmt.executeQuery("SELECT * from githuber");

            while(resultat.next()){
                Githuber githuber = Githuber.builder()
                        .id(resultat.getLong("github_id"))
                        .email(resultat.getString("email"))
                        .bio(resultat.getString("bio"))
                        .location(resultat.getString("location"))
                        .url(resultat.getString("url"))
                        .avatarUrl(resultat.getString("avatar_url"))
                        .login(resultat.getString("login"))
                        .name(resultat.getString("name"))
                        .build();

                githubers.add(githuber);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return githubers;
    }

    public void deleteGithuber(String login) {
        try{
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM githuber where login = '" + login + "';  ");
        }catch (Exception e){ e.printStackTrace();}
    }

}
