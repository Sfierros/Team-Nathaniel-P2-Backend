package com.teamnathaniel.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Console")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "consoleName")
public class Console {

    @Id
    private int consoleId;
    @Column
    private String consoleName;
    @Column
    private String releaseDate;

    @ManyToMany(fetch =  FetchType.EAGER)
    @JoinColumn(name = "gameId")
    private List<Game> game;


}
