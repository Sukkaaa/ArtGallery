package org.xproce.projetartist.metier;

import org.xproce.projetartist.dao.entities.ArtPiece;


public interface InventoryManager {

    public boolean removeFromInventory(ArtPiece artPiece);

}
