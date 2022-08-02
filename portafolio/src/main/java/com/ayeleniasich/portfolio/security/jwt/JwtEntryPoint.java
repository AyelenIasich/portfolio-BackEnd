package com.ayeleniasich.portfolio.security.jwt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.security.web.AuthenticationEntryPoint;

@Component
public class JwtEntryPoint  implements AuthenticationEntryPoint{

    
//    metodo para ver que nos da error en desarrollo
//    Clase logger rechaza todas las peticiones no autenticadas. 
    
    private final static Logger logger =LoggerFactory.getLogger(JwtEntryPoint.class);
    
    @Override
    public void commence(HttpServletRequest req, HttpServletResponse res, AuthenticationException e) throws IOException, ServletException {
        logger.error("Fail en el método commmence");
        res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "No autorizado" );
    }
    
}
