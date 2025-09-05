import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/add-to-wishlist")
public class AddToWishlistServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        String movieId = request.getParameter("movie_id");
        String title = request.getParameter("title");
        String poster = request.getParameter("poster");
        int userId = 1; // Example: get user ID from session

        try {
            Connection conn = DBConnection.getConnection();
            String sql = "INSERT INTO wishlist (user_id, movie_id, movie_title, poster_url) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.setString(2, movieId);
            ps.setString(3, title);
            ps.setString(4, poster);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("wishlist.jsp"); // Redirect to My List page
    }
}