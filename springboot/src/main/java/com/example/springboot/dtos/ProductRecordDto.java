package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value) {}
