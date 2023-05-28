package com.devsuperior.capitulo23.domain.dto;

import java.time.LocalDate;

public record UserAllDTO(Long id, String name, String email, String phone, String password, LocalDate birthDate) {

}
