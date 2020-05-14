package model.common;

public interface Repository<Entity> {
    
    Entity findById(Integer id);
    Entity save(Entity objectSaved);

}