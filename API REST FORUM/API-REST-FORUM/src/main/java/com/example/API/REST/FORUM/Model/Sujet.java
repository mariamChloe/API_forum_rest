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
@Table(name = "sujet")
public class Sujet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "theme",nullable = false)
    private String theme;

    @ManyToOne
    @JoinColumn(name = "forum_id")
    private Forum forum;


    @OneToMany(mappedBy = "sujet")
    private Set<Message> messages;

}
