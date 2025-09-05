package dao;

import model.Video;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;

public class VideoDAO {

    // Assuming you have a Database connection utility class
    private Connection getConnection() throws SQLException {
        // Replace with your actual DB connection details
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";
        
        return DriverManager.getConnection(url, username, password);
    }

    // Get all videos (e.g., for the homepage)
    public List<Video> getAllVideos() {
        List<Video> videoList = new ArrayList<>();
        String query = "SELECT * FROM videos"; // SQL query to fetch all videos
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Video video = new Video();
                video.setId(rs.getInt("id"));
                video.setTitle(rs.getString("title"));
                video.setDescription(rs.getString("description"));
                video.setThumbnailUrl(rs.getString("thumbnailUrl"));
                video.setCategory(rs.getString("category")); // assuming you have a category field
                videoList.add(video);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately
        }
        return videoList;
    }

    // Get "Continue Watching" videos for a specific user
    public List<Video> getContinueWatchingVideos(String userId) {
        List<Video> continueWatchingVideos = new ArrayList<>();
        String query = "SELECT v.* FROM videos v " +
                       "JOIN user_video_history uvh ON v.id = uvh.video_id " +
                       "WHERE uvh.user_id = ? AND uvh.status = 'watching'"; // Example query to get videos the user is watching
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, userId);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Video video = new Video();
                    video.setId(rs.getInt("id"));
                    video.setTitle(rs.getString("title"));
                    video.setDescription(rs.getString("description"));
                    video.setThumbnailUrl(rs.getString("thumbnailUrl"));
                    video.setCategory(rs.getString("category"));
                    continueWatchingVideos.add(video);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately
        }
        return continueWatchingVideos;
    }

    // Get "Trending Now" videos
    public List<Video> getTrendingNowVideos() {
        List<Video> trendingVideos = new ArrayList<>();
        String query = "SELECT * FROM videos WHERE category = 'trending' ORDER BY views DESC LIMIT 10"; // Example query to fetch trending videos
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Video video = new Video();
                video.setId(rs.getInt("id"));
                video.setTitle(rs.getString("title"));
                video.setDescription(rs.getString("description"));
                video.setThumbnailUrl(rs.getString("thumbnailUrl"));
                video.setCategory(rs.getString("category"));
                trendingVideos.add(video);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately
        }
        return trendingVideos;
    }
}
