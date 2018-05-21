package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.dao.InMemory;
import fr.wildcodeschool.githubtracker.service.GithubersService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UntrackServlet", urlPatterns = {"/untrack"})
public class UntrackServlet extends HttpServlet {

    @Inject
    GithubersService ghs;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String loginUntrack = request.getParameter("login");
        ghs.untrackGithuber(loginUntrack);
        response.sendRedirect(request.getContextPath() + "/githubers");
    }
}
