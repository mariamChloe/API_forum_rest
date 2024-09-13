package com.example.API.REST.FORUM.Model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "forum")
public class Forum implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom",nullable = false)
    private String nom;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private Instant date;


    @OneToMany(mappedBy = "forum")
    private Set<Sujet>sujets;

}
