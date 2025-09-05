<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.Video" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
    <title>Floret - Home</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #141414;
            color: white;
            font-family: Arial, sans-serif;
        }
        .video-card {
            background-color: #1e1e1e;
            border: none;
            transition: transform 0.3s;
        }
        .video-card:hover {
            transform: scale(1.05);
            box-shadow: 0 0 10px rgba(255, 255, 255, 0.2);
        }
        .video-thumb {
            width: 100%;
            height: 180px;
            object-fit: cover;
            border-radius: 5px 5px 0 0;
        }
        .card-title {
            font-size: 1.1rem;
            color: #ffffff;
        }
        .card-text {
            color: #cccccc;
            font-size: 0.9rem;
        }
        .container {
            max-width: 1140px;
        }
        h2 {
            color: #ffffff;
        }
    </style>
</head>
<body>
<div class="container mt-5">

    <!-- 🎬 Continue Watching -->
    <h2 class="mb-4">🎬 Continue Watching</h2>
    <div class="row">
        <c:forEach var="video" items="${continueWatching}">
            <div class="col-md-4 mb-4">
                <div class="card video-card">
                    <a href="player.jsp?id=${video.id}">
                        <img src="${video.thumbnailUrl}" class="card-img-top video-thumb" alt="${video.title}">
                    </a>
                    <div class="card-body">
                        <h5 class="card-title">${video.title}</h5>
                        <p class="card-text">${video.description}</p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>

    <!-- 🎬 Trending Now -->
    <h2 class="mb-4">🎬 Trending Now</h2>
    <div class="row">
        <c:forEach var="video" items="${trendingNow}">
            <div class="col-md-4 mb-4">
                <div class="card video-card">
                    <a href="player.jsp?id=${video.id}">
                        <img src="${video.thumbnailUrl}" class="card-img-top video-thumb" alt="${video.title}">
                    </a>
                    <div class="card-body">
                        <h5 class="card-title">${video.title}</h5>
                        <p class="card-text">${video.description}</p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>

</div>
</body>
</html>
