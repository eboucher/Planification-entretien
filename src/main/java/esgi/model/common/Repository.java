package esgi.model.common;

import java.util.UUID;

public interface Repository<Entity> {

    Entity findById(UUID id) throws Exception;
    Entity save(Entity objectSaved);

}
