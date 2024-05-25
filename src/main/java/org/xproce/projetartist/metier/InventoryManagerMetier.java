package org.xproce.projetartist.metier;

import org.xproce.projetartist.dao.entities.ArtPiece;
import org.xproce.projetartist.dao.entities.Inventory;
import org.xproce.projetartist.dao.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryManagerMetier implements InventoryManager {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public boolean removeFromInventory(ArtPiece artPiece) {
        try{
            inventoryRepository.deleteById(artPiece.getId());
            return true;
        }
        catch(Exception exception)
        {
            return false;
        }
    }


}
