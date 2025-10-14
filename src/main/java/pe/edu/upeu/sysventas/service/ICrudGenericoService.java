package pe.edu.upeu.sysventas.service;

import pe.edu.upeu.sysventas.model.Marca;

import java.util.List;

public interface ICrudGenericoService <T,ID>{
    T save(T t);
    T update(ID id,T t);
    List<T> findAll();
    T findbyId(ID id);
    void deleteById(ID id);
    void delete(T t);
}
