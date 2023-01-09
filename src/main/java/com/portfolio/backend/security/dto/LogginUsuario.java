package com.portfolio.backend.security.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogginUsuario {
    
    @NotBlank
    private String nombreUsuario;
    @NotBlank
    private String password;
}
