package ar.edu.undec.mascotasCompelto.persistencia.crud;

import ar.edu.undec.mascotasCompelto.persistencia.entity.MascotaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICrearMascotaCRUD extends CrudRepository<MascotaEntity, Integer> {


}
