package com.cidades.cidadesinteligentes.repository;

import com.cidades.cidadesinteligentes.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository  extends JpaRepository<Sensor, Long> {
}
