package br.com.nielsonferreira.models.dtos;

import br.com.nielsonferreira.models.requests.CreateMachineRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MachineEventDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private Long machineId;
    private String machineName;
    private String machineStatus;
    private String machineType;

    public MachineEventDTO(CreateMachineRequest request) {
        this.machineId = request.machineId();
        this.machineName = request.machineName();
        this.machineStatus = request.machineStatus();
        this.machineType = request.machineType();
    }
}
