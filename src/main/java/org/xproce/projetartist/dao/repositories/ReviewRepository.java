package org.xproce.projetartist.dao.repositories;

import org.xproce.projetartist.dao.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
