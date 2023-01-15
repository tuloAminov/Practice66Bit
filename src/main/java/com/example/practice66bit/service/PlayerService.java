package com.example.practice66bit.service;

import com.example.practice66bit.data.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private PlayerRepo playerRepo;

    @Autowired
    public PlayerService(PlayerRepo playerRepo) {
        this.playerRepo = playerRepo;
    }

    public void addPlayer(Player player) {
        playerRepo.save(player);
    }

    public List<Player> getAllPlayers() {
        return playerRepo.findAll();
    }
}
