package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.About;
import java.util.List;
import java.util.Optional;

public interface IAboutService {

    public List<About> VerAbout();

    public Optional<About> buscarAbout(Long id);

    public void crearAbout(About about);

    public void borrarAbout(Long id);

    public boolean existsById(Long id);

}
