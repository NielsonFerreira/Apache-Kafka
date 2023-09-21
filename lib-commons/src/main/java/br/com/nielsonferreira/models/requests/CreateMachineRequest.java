package br.com.nielsonferreira.models.requests;

public record CreateMachineRequest(Long machineId,
                                   String machineName,
                                   String machineStatus,
                                   String machineType) {}
