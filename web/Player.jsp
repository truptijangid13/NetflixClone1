<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.Video,dao.VideoDAO" %>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    VideoDAO dao = new VideoDAO();
    Video video = dao.getVideoById(id);
%>

<html>
<head>
    <title><%= video.getTitle() %> - Floret</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2><%= video.getTitle() %></h2>
    <video width="100%" controls>
        <source src="<%= video.getVideoUrl() %>" type="video/mp4">
        Your browser does not support the video tag.
    </video>
    <p class="mt-3"><%= video.getDescription() %></p>
</div>
</body>
</html>

