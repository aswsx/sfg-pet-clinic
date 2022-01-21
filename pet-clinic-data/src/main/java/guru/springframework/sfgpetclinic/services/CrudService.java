package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 21/01/2022 - 17:47
 */
public interface CrudService<T, ID> {
    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
