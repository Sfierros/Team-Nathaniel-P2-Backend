package com.teamnathaniel.repository;

import com.teamnathaniel.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CharacterRepository extends JpaRepository<Character, String> {

    @Query("From Character")
    List<Character> findAll();

    @Query("from Character where characterName = :name")
    Character findByName(String name);

    @Query("from Character where characterId = :id")
    Character findById(int id);

    Character save(Character character);

    void delete(Character character);

}
