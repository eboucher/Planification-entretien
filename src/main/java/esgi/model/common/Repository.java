package esgi.model.common;

public interface Repository<Entity> {

    Entity findById(String id) throws Exception;
    Entity save(Entity objectSaved);

}
