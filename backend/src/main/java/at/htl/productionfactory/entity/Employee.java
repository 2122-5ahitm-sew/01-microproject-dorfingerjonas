package at.htl.productionfactory.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Employee extends PanacheEntity {

    public String name;
    public int age;
    public float salary;
    public LocalDate hireDate;

    @Enumerated(EnumType.STRING)
    public MachineType handleAbleMachineType;

    @OneToMany
    @Cascade(CascadeType.ALL)
    public List<Production> productions;

    public Employee(String name, int age, float salary, LocalDate hireDate, MachineType handleAbleMachineType) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
        this.handleAbleMachineType = handleAbleMachineType;
    }

    public Employee(String name, int age, float salary, LocalDate hireDate, MachineType handleAbleMachineType, List<Production> productions) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
        this.handleAbleMachineType = handleAbleMachineType;
        this.productions = productions;
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
                ", handleAbleMachineType=" + handleAbleMachineType +
                ", productions=" + productions +
                '}';
    }
}
