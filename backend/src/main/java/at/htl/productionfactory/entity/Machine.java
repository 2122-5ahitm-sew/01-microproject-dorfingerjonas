package at.htl.productionfactory.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Machine extends PanacheEntity {

    @Enumerated(EnumType.STRING)
    public MachineType machineType;

    public Machine(MachineType machineType) {
        this.machineType = machineType;
    }

    public Machine() {
    }

    @Override
    public String toString() {
        return "Machine{" +
                "machineType=" + machineType +
                '}';
    }
}
