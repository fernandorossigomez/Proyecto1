package com.fernando.proyecto1.entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum OrderStatus {
    PENDING,
    COMPLETED,
    CANCELLED
}