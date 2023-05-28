package com.devsuperior.capitulo23.domain.dto;

import com.devsuperior.capitulo23.domain.entities.User;
import com.devsuperior.capitulo23.domain.enums.OrderStatus;

import java.time.Instant;

public record OrderAllDTO(Long id, Instant moment, OrderStatus status, User cliente) {
}
