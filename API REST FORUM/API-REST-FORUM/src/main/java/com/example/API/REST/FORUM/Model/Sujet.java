package com.example.API.REST.FORUM.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Sujet")
public class Sujet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Theme")
    private String theme;

    @ManyToOne
    @JoinColumn(name = "forum_id")
    private Forum forum;


    @OneToMany(mappedBy = "sujet",fetch = FetchType.EAGER)
    private Set<Message> messages;

}
