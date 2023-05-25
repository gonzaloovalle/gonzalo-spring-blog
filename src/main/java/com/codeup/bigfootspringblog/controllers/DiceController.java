package com.codeup.bigfootspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String rollDice() {
        return "rollDice";
    }

    @GetMapping("/roll-dice/{n}")
    public String rollResult(@PathVariable int n, Model model) {
        int randomNum = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);

        String result = "";

        if (n == randomNum) {
            result = "You won!";
        } else {
            result = "Try again!";
        }

        model.addAttribute("userGuess", "You guessed " + n);
        model.addAttribute("randomNumber", "You rolled a " + randomNum);
        model.addAttribute("resultMessage", result);

        return "rollDice";
    }
}
