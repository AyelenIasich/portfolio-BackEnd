/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayeleniasich.portfolio.service;

import com.ayeleniasich.portfolio.model.Educacion;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Ayelén
 */
public interface IEducacionService {

    public List<Educacion> VerEducacion();

    public Optional<Educacion> buscarEducacion(Long id);

    public void crearEducacion(Educacion edu);

    public void borrarEducacion(Long id);

    public boolean existsById(Long id);

}
