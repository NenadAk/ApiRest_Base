package perso.api.rest.repositories;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import perso.api.rest.models.Item;

@Repository
public interface ItemRepository extends ListCrudRepository<Item, Integer> {

}