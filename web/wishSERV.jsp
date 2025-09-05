<%@ page import="java.sql.*, java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Integer userId = (Integer) session.getAttribute("userId"); // should be set at login

    if (userId == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/floret", "root", "");

        String sql = "SELECT v.* FROM wishlist w JOIN videos v ON w.video_id = v.id WHERE w.user_id = ?";
        ps = conn.prepareStatement(sql);
        ps.setInt(1, userId);
        rs = ps.executeQuery();
%>

<h2>Your Wishlist</h2>
<div class="video-container">
<%
    while (rs.next()) {
%>
    <div class="video-card">
        <img src="<%= rs.getString("thumbnail_url") %>" width="200px" />
        <h3><%= rs.getString("title") %></h3>
        <p><%= rs.getString("description") %></p>
    </div>
<%
    }
%>
</div>

<%
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (rs != null) rs.close();
        if (ps != null) ps.close();
        if (conn != null) conn.close();
    }
%>
