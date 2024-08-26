package perso.api.rest.Exceptions;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(Integer id) {
        super("Could not find item n° " + id);
    }
}
