package repository;

/*
Author: Emmanuel Posholi Posholi (222144408)
Date: 28 March 2025
*/

import java.util.List;
import java.util.Optional;

public interface IRepository<T, ID> {

    T create(T entity);

    Optional<T> read(ID id);

    T update(T entity);

    boolean delete(ID id);

    List<T> findAll();
}
