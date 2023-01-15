package com.example.practice66bit.controllers;

import com.example.practice66bit.data.Player;
import com.example.practice66bit.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    private final PlayerService playerService;

    @Autowired
    public MainController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @ModelAttribute("players")
    public List<Player> allPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/add")
    public String addPlayer(Model model) {
        model.addAttribute("player", new Player());
        return "addPlayer";
    }

    @GetMapping("/all")
    public String getAllPlayers() {
        return "allPlayers";
    }

    @PostMapping("/add")
    public String playerPostAdd(Player player, Model model) {
        model.addAttribute("player", player);
        playerService.addPlayer(player);
        return "redirect:/all";
    }
}
