package com.tambuahciek.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Table(name = "makanan")
public class Makanan {

    @Id
    private long id;

    @Column(name = "nama")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "harga")
    private String harga;

    private String keterangan;


}
