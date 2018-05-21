<%@ page import="fr.wildcodeschool.githubtracker.model.Githuber" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: lucile
  Date: 24/04/18
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="header.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="githuber" items="${githubers}">
    <div class="col-xs-12 col-sm-6 col-md-4">
        <div class="card">
            <div class="card-body text-center">
                <p><img class="img-fluid" src="${githuber.avatarUrl}" alt="card image"></p>
                <p class="card-text">${githuber.login}</p>
                <a href="${pageContext.request.contextPath}/untrack?login=${githuber.login}">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Untrack</button></a>

            </div>
        </div>
    </div>
</c:forEach>

<style>
    .img-fluid {
        border-radius: 20%;
        max-height: 50px;
    }
</style>
</body>
</html>
