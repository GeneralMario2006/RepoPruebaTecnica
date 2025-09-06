/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Tienda_Prueba_Tecnica.Repositorys;

import com.example.Tienda_Prueba_Tecnica.DTOS.ResponseCategory;
import com.example.Tienda_Prueba_Tecnica.DTOS.ResponseProduct;
import com.example.Tienda_Prueba_Tecnica.Entitys.CategoryEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 Al seleccionar una categoría, mostrar los nombres de los productos vendidos en el año 2019 que correspondan a la categoría seleccionada.
 */
@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    
    @Query("SELECT new com.example.Tienda_Prueba_Tecnica.DTOS.ResponseProduct(sell.products.name) FROM SellsEntity AS sell WHERE sell.products.category.name_category LIKE CONCAT('%', :name_category, '%') AND FUNCTION('YEAR', sell.date) =2019")
    List<ResponseProduct> returnNameCategory(@Param("name_category") String category);
    
    @Query("SELECT new com.example.Tienda_Prueba_Tecnica.DTOS.ResponseCategory(c.name_category) FROM CategoryEntity AS c")
    List<ResponseCategory> returnAllCategory();
    
}
