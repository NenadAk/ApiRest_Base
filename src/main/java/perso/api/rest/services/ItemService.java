package perso.api.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import perso.api.rest.Exceptions.ItemNotFoundException;
import perso.api.rest.models.Item;
import perso.api.rest.repositories.ItemRepository;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    public Item getItem(Integer id) {
        
        return itemRepository.findById(id)
         .orElseThrow(() -> new ItemNotFoundException(id));
        
    }

    public Item addItem(Item newItem) {
        return itemRepository.save(newItem);
    }

    public void deleteItem(Integer id) {
        itemRepository.deleteById(id);
    }

    public void updateItem(Item itemPatched) {
        itemRepository.save(itemPatched);
    }
}