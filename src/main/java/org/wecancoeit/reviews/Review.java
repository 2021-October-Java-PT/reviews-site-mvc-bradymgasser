package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String season;
    private String image;
    private String ranking;
    private String record;
    private String description;
    private String details;

    public Long getId() {
        return id;
    }

    public String getSeason() {
        return season;
    }

    public String getImage() {
        return image;
    }

    public String getRanking() {
        return ranking;
    }

    public String getRecord() {
        return record;
    }

    public String getDescription() {
        return description;
    }

    public String getDetails() {
        return details;
    }

    public Review(long id, String season, String image, String ranking, String record, String description, String details) {
        this.id = id;
        this.season = season;
        this.image = image;
        this.ranking = ranking;
        this.record = record;
        this.description = description;
        this.details = details;
    }

}
