/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controllers;

import com.example.models.Producto;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author rober
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String mostrarHome(Model model) {

        String articulo = "ARTICULO 1";
        model.addAttribute("articulo", articulo);

        Producto producto1 = new Producto(1, "nombre1", "descripcion1", 60.0);

        model.addAttribute("producto1", producto1);

        return "home";
    }

    @GetMapping("/lista")
    public String mostrarListado(Model model) {
        ArrayList<String> productos = new ArrayList<>();
        productos.add("producto1");
        productos.add("producto2");
        productos.add("producto3");
        productos.add("producto4");

        model.addAttribute("productos", productos);

        return "lista";
    }

    @GetMapping("/tabla")
    public String mostrarProductos(Model model) {

        ArrayList<Producto> productos = obtenerProductos();
        model.addAttribute("listaProductos", productos);
        return "lista";
    }

    private ArrayList<Producto> obtenerProductos() {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "producto 1", "descripcion1", 60.0));
        productos.add(new Producto(2, "producto 2", "descripcion1", 90.0));
        productos.add(new Producto(2, "producto 3", "descripcion1", 100.0));
        return productos;
    }
}
