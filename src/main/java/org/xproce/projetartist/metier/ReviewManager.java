package org.xproce.projetartist.metier;

import org.xproce.projetartist.dao.entities.Review;

import java.util.List;

public interface ReviewManager {
    public List<Review> getAllReviews();
    public Review saveReview(Review review);
    public Review findReviewById(Long id);
}
