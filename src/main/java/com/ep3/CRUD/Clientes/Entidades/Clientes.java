package com.ep3.CRUD.Clientes.Entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_cliente")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String nombre;
    private String apellido;
    @Column(unique = true)
    private String correo;
    @Column(unique = true)
    private String celular;
}