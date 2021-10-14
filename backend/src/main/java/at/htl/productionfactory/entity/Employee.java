package at.htl.productionfactory.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.json.bind.annotation.JsonbProperty;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity
public class Employee extends PanacheEntity {

    public String name;
    public int age;
    public float salary;
    public LocalDate hireDate;

    @Enumerated(EnumType.STRING)
    @JsonbProperty("can_operate")
    public MachineType canOperate;

    public Employee(String name, int age, float salary, LocalDate hireDate, MachineType canOperate) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
        this.canOperate = canOperate;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", canOperate=" + canOperate +
                '}';
    }
}
