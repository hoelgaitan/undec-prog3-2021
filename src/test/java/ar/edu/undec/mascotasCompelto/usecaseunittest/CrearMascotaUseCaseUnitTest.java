package ar.edu.undec.mascotasCompelto.usecaseunittest;

import ar.edu.undec.mascotasCompelto.domain.Mascota;
import ar.edu.undec.mascotasCompelto.exceptions.MascotaExisteException;
import ar.edu.undec.mascotasCompelto.repositorio.ICrearMascotaRepositorio;
import ar.edu.undec.mascotasCompelto.usecase.CrearMascotaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import java.time.LocalDate;

import static org.mockito.Mockito.when;


@ExtendWith({Mockito.MockitoExtension.class})

public class CrearMascotaUseCaseUnitTest {

    @Mock
    ICrearMascotaRepositorio crearMascotaRepositorio;


    @Test
    void crearMascota_mascotaNoExiste_CrearMascota() throws MascotaExisteException {// vamos a crear mascota, el escenario es no existe, creamos- flujo normal
        //Arrange
        Mascota laMascota = Mascota.instancia("Lolo", "callejero", LocalDate.of(2020, 05,05));
        CrearMascotaUseCase crearMascotaUseCase = new CrearMascotaUseCase(crearMascotaRepositorio);

        // simulo base de datos

        when(crearMascotaRepositorio.existe(laMascota.getNombre())).thenReturn(false);
        when(crearMascotaRepositorio.guardarMascota(laMascota)).thenReturn(true);
        //Act
        boolean resultado = crearMascotaUseCase.crearMascota(laMascota);
        //Assert
        Assertions.assertTrue(resultado);


    }

    @Test
    void crearMascota_mascotaExiste_MascotaExisteException(){
        //Arrange
        Mascota laMascota = Mascota.instancia("Lolo", "callejero", LocalDate.of(2020, 05,05));
        CrearMascotaUseCase crearMascotaUseCase = new CrearMascotaUseCase(crearMascotaRepositorio);

        // simulo base de datos

        when(crearMascotaRepositorio.existe(laMascota.getNombre())).thenReturn(true);


        //act y Assert
        Assertions.assertThrows(MascotaExisteException.class, ()->crearMascotaUseCase.crearMascota(laMascota));
    }

}
