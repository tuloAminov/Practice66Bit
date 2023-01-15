package com.example.practice66bit.service;

import com.example.practice66bit.data.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<Player, Integer> {
}
