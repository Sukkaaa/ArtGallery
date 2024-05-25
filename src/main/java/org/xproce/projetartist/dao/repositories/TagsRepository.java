package org.xproce.projetartist.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.xproce.projetartist.dao.entities.Tags;

@Repository
public interface TagsRepository extends JpaRepository<Tags,Long> {
}
