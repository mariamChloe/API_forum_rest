package com.example.API.REST.FORUM.Model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

import java.time.Instant;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Forum")
public class Forum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nom")
    private String nom;

    @Column(name = "Description")
    private String description;

    @Column(name = "Date")
    private Instant date;


    @OneToMany(mappedBy = "forum",fetch = FetchType.EAGER)
    private Set<Sujet>sujets;

}
