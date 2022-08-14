
package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.Trabajo;
import java.util.List;
import java.util.Optional;


public interface ITrabajoService {
     public List<Trabajo> VerTrabajo();

    public Optional<Trabajo> buscarTrabajo(Long id);

    public void crearTrabajo(Trabajo trabajo);

    public void borrarTrabajo(Long id);

    public boolean existsById(Long id);
}
 
