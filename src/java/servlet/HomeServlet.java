package servlet;

import dao.VideoDAO;
import model.Video;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.List;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type
        response.setContentType("text/html");

        // Get userId (You can replace this with the actual user ID, e.g., from session)
        String userId = "user123";  // Example user ID (replace with session.getAttribute("userId") if logged in)

        // Create VideoDAO instance
        VideoDAO videoDAO = new VideoDAO();

        // Get all videos (you can keep this for displaying all videos, or you can replace it)
        List<Video> videoList = videoDAO.getAllVideos();

        // Get the filtered lists for "Continue Watching" and "Trending Now"
        List<Video> filteredList1 = videoDAO.getContinueWatchingVideos(userId);  // Get Continue Watching list
        List<Video> filteredList2 = videoDAO.getTrendingNowVideos();  // Get Trending Now list

        // Set the lists as request attributes
        request.setAttribute("videos", videoList); // All videos (if needed)
        request.setAttribute("continueWatching", filteredList1); // Continue Watching videos
        request.setAttribute("trendingNow", filteredList2); // Trending Now videos

        // Forward the request to home.jsp
        RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
        rd.forward(request, response);
    }
}
