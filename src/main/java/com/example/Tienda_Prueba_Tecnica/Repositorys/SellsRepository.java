/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Tienda_Prueba_Tecnica.Repositorys;

import com.example.Tienda_Prueba_Tecnica.Entitys.SellsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mr587
 */
@Repository
public interface SellsRepository extends JpaRepository<SellsEntity, Long>{
    
}
