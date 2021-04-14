package ar.edu.undec.mascotasCompelto.persistencia;

import ar.edu.undec.mascotasCompelto.domain.Mascota;
import ar.edu.undec.mascotasCompelto.persistencia.crud.ICrearMascotaCRUD;
import ar.edu.undec.mascotasCompelto.persistencia.entity.MascotaEntity;
import ar.edu.undec.mascotasCompelto.repositorio.ICrearMascotaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class CrearMascotaRepoImplementacion implements ICrearMascotaRepositorio {

    @Autowired
    ICrearMascotaCRUD crearMascotaCRUD;

    @Override
    public boolean existe(String nombreMascota) {

        return false;
    }

    @Override
    public boolean guardarMascota(Mascota laMascota) {

        MascotaEntity mascotaBD = new MascotaEntity();
        mascotaBD.setNombre(laMascota.getNombre());
        mascotaBD.setFechaNacimiento(laMascota.getFechaNacimiento());
        mascotaBD.setRaza(laMascota.getRaza());

        return this.crearMascotaCRUD.save(mascotaBD).getIdMascota()!=null;
    }
}
