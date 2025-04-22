package com.cidades.cidadesinteligentes.controller;

import com.cidades.cidadesinteligentes.model.Sensor;
import com.cidades.cidadesinteligentes.repository.SensorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensores")
public class SensorController {
    private final SensorRepository sensorRepository;

    public SensorController(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    // Implementar os métodos para manipulação de sensores (CRUD)

    @GetMapping
    public List<Sensor> getAllSensors() {
        return sensorRepository.findAll();
    }

    @PostMapping
    public Sensor createSensor(Sensor sensor) {
        return sensorRepository.save(sensor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sensor> atualizarSensor(@PathVariable Long id, @RequestBody Sensor sensorAtualizado) {
        return sensorRepository.findById(id)
                .map(sensor -> {
                    sensor.setNome(sensorAtualizado.getNome());
                    sensor.setLocalizacao(sensorAtualizado.getLocalizacao());
                    sensor.setAtivo(sensorAtualizado.isAtivo());
                    sensorRepository.save(sensor);
                    return ResponseEntity.ok(sensor);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarSensor(@PathVariable Long id) {
        if (sensorRepository.existsById(id)) {
            sensorRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
