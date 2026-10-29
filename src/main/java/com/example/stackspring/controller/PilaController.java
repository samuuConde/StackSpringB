package com.example.stackspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Stack;

@RestController
@RequestMapping("/pila")
public class PilaController {
    Stack<Character> letras = new Stack<>();

    @PostMapping
    public Character meter(@RequestParam Character valor) {

        return letras.push(valor);
    }

    @GetMapping("/pop")
    public Character quitar() {

        return letras.pop();
    }

    @GetMapping("/peek")
    public Character verUltimo() {

        return letras.peek();
    }

    @GetMapping
    public Stack<Character> mostrar() {

        return letras;
    }
}