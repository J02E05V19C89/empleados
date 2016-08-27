/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.lab.aplicaciones.empleados.modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Esteban
 */
 @Entity
 @Table(name = "Salary")    

 public class Salary {
    
    @Id   
    private Employes empleado;
     
    @Column(name = "salary")
    private int salary;
   
    @Id 
    @Column(name = "from_date")
    private Date fromdate;
   
    @Column(name = "to_date")
    private Date todate;

    public Employes getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Employes empleado) {
        this.empleado = empleado;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

   
   
   
}
