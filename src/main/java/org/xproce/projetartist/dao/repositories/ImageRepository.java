package org.xproce.projetartist.dao.repositories;

import org.xproce.projetartist.dao.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {
}
