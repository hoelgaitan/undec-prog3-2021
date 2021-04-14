package ar.edu.undec.mascotasCompelto.persistenceTest;

import ar.edu.undec.mascotasCompelto.domain.Mascota;
import ar.edu.undec.mascotasCompelto.persistencia.CrearMascotaRepoImplementacion;
import ar.edu.undec.mascotasCompelto.persistencia.crud.ICrearMascotaCRUD;
import ar.edu.undec.mascotasCompelto.persistencia.entity.MascotaEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class CrearMascotaDataTest {
    @InjectMocks
    CrearMascotaRepoImplementacion crearMascotaRepoImplementacion;

    @Mock
    ICrearMascotaCRUD crearMascotaCRUD;

    @Test
    public void testCrearMascota(){
        Mascota laMascota = Mascota.instancia("Lolo", "callejero", LocalDate.of(2020, 05,05));
        boolean resultado = crearMascotaRepoImplementacion.guardarMascota(laMascota);
        Assertions.assertTrue(resultado);

    }
}
