/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Tienda_Prueba_Tecnica;

import com.example.Tienda_Prueba_Tecnica.Service.ServiceCategory;
import com.example.Tienda_Prueba_Tecnica.request.RequestCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mr587
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/Category")
public class Controller {
    @Autowired
    ServiceCategory sc;
    
    @PostMapping("/name")
    public ResponseEntity<?>ReturnCategoryName(@RequestBody RequestCategory category) {
        String categoryName= category.getName();
        return ResponseEntity.ok(sc.returnProductsThanSellings2019(categoryName));
    }
    
    @GetMapping("/all")
    public ResponseEntity<?>ReturnAllCategorys() {
            return ResponseEntity.ok(sc.returnAllCategory());
    }
}
