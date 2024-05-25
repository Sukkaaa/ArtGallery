package org.xproce.projetartist.dao.repositories;

import org.xproce.projetartist.dao.entities.ArtPiece;
import org.xproce.projetartist.dao.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {

}
