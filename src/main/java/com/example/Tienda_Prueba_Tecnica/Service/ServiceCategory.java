/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Tienda_Prueba_Tecnica.Service;

import com.example.Tienda_Prueba_Tecnica.DTOS.ResponseProduct;
import com.example.Tienda_Prueba_Tecnica.Repositorys.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 *
 * @author mr587
 */
@Service
public class ServiceCategory {
    @Autowired
    CategoryRepository repo;
    
    
    public List<ResponseProduct>returnCategory(String name) {
        List<ResponseProduct> response= repo.returnNameCategory(name);
        if (response.isEmpty()) {
            return response;
        }        
        return response;
    }
}
