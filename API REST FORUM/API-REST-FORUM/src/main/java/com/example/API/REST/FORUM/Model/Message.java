package com.example.API.REST.FORUM.Model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "message")
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contenu", nullable = false)
    private String contenu;

    @Column(name = "date", nullable = false)
    private Instant date;

    @Column(name = "slug", unique = true)
    private String slug;

    @ManyToOne
    @JoinColumn(name = "sujet_id") // Clé étrangère
    private Suject sujet;


}
