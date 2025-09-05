package model;

public class Video {
    private int id;
    private String title;
    private String description;
    private String thumbnailUrl;
    private String videoUrl;

    private String category;
    private int progress;
    private boolean isTrending;
    private boolean isNewRelease;

    public Video() {}

    public Video(int id, String title, String description, String thumbnailUrl, String videoUrl,
                 String category, int progress, boolean isTrending, boolean isNewRelease) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnailUrl = thumbnailUrl;
        this.videoUrl = videoUrl;
        this.category = category;
        this.progress = progress;
        this.isTrending = isTrending;
        this.isNewRelease = isNewRelease;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getThumbnailUrl() { return thumbnailUrl; }
    public void setThumbnailUrl(String thumbnailUrl) { this.thumbnailUrl = thumbnailUrl; }

    public String getVideoUrl() { return videoUrl; }
    public void setVideoUrl(String videoUrl) { this.videoUrl = videoUrl; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getProgress() { return progress; }
    public void setProgress(int progress) { this.progress = progress; }

    public boolean isTrending() { return isTrending; }
    public void setTrending(boolean trending) { isTrending = trending; }

    public boolean isNewRelease() { return isNewRelease; }
    public void setNewRelease(boolean newRelease) { isNewRelease = newRelease; }
}
