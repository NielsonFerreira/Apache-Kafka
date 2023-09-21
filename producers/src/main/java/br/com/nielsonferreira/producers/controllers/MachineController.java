package br.com.nielsonferreira.producers.controllers;

import br.com.nielsonferreira.models.requests.CreateMachineRequest;
import br.com.nielsonferreira.producers.services.MachineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("machines")
public class MachineController {

    private final MachineService service;

    @PostMapping
    ResponseEntity<Void> createEvent(@RequestBody CreateMachineRequest request) {
        service.createEvent(request);
        return ResponseEntity.ok().build();
    }
}
