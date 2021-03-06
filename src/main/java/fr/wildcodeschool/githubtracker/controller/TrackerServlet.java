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

@WebServlet(name = "TrackerServlet", urlPatterns = {"/track"})
public class TrackerServlet extends HttpServlet {

    @Inject
    @InMemory
    private GithuberDAO dao;

    @Inject
    GithubersService ghs;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if(ghs.track(request.getParameter("login"))) {
            response.sendRedirect(request.getContextPath() + "/githubers");
        }
                else{
            request.getRequestDispatcher("/track.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/track.jsp").forward(request, response);

    }
}
