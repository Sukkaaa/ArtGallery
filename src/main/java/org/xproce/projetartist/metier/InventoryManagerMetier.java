package metier;

import dao.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryManagerMetier implements InventoryManager {

    @Autowired
    private InventoryRepository inventoryRepository;
}
