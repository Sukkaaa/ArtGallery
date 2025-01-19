package org.xproce.projetartist.dao.repositories;


import org.xproce.projetartist.dao.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;



public interface InventoryRepository extends JpaRepository<Inventory,Long> {

}
