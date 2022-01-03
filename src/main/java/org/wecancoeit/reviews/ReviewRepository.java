package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository() {
        Review twentyOne = new Review(101L, "2021", "/brownsImages/img21.png", "All-time Bad Ranking: 1st", "Record: TBD",
                "Tragedy. Stealing defeat from the jaws of victory.",
                "The Browns found many creative ways to lose in a year when it could not have been any easier to win the North. We now have to suffer through two meaningless divisional games to end the ugliest season ever.");
        Review seventeen = new Review(102L, "2017", "/brownsImages/img17.png", "All-time Bad Ranking: 2nd", "Record: 0-16", "Winless.",
                "It never hurt so good. Sweet, sweet misery. We're all masochists now.");
        Review sixteen = new Review(103L, "2016", "/brownsImages/img16.png", "All-time Bad Ranking: 3rd", "Record: 1-15", "Should've been winless.",
                "Why did we have to win the second to last game of the year? That somehow made it more embarrassing while simultaneously robbing us of ugly perfection....but not for long.");
        Review nineteen = new Review(104L, "2019", "/brownsImages/img19.png", "All-time Bad Ranking: 4th", "Record: 6-10", "Should've been winners.",
                "Some guy named Freddie gets named Head Coach going into a year with the maximum amount of expectations and prime time games. What could go wrong?");
        Review fourteen = new Review(105L, "2014", "/brownsImages/img14.png", "All-time Bad Ranking: 5th", "Record:7-9", "Hopes up, then crushed.",
                "The Browns are a surprise team deep in the season but manage to go on a five game losing streak to close it out strong. We should have known.");

        reviewList.put(twentyOne.getId(), twentyOne);
        reviewList.put(seventeen.getId(), seventeen);
        reviewList.put(sixteen.getId(), sixteen);
        reviewList.put(nineteen.getId(), nineteen);
        reviewList.put(fourteen.getId(), fourteen);

    }

    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }
}
