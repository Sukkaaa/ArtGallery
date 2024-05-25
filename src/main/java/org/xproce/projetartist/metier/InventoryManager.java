package org.xproce.projetartist.metier;

import org.xproce.projetartist.dao.entities.ArtPiece;
import org.xproce.projetartist.dao.entities.Artist;
import org.xproce.projetartist.dao.entities.Inventory;

public interface InventoryManager {

    public boolean removeFromInventory(ArtPiece artPiece);

}
