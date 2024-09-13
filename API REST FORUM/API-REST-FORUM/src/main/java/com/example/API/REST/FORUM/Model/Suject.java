package com.example.API.REST.FORUM.Model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Sujet")
public class Suject implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Theme", nullable = false)
    private String theme;

    @ManyToOne
    @JoinColumn(name = "forum_id") // Clé étrangère
    private Forum forum;

    @Column(name = "slug", unique = true)
    private String slug;


    @OneToMany(mappedBy = "sujet", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Message> messages;

}
