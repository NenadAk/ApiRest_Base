package perso.api.rest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {

    @Id
    public Integer id;

    public String name;
    public String description;

    
}