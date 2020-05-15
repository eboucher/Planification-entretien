package esgi.model.common;

public interface Repository<Entity> {

    Entity findById(Integer id) throws Exception;
    Entity save(Entity objectSaved);

}
