/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Tienda_Prueba_Tecnica.Entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author mr587
 */
@Entity
@Table(name= "productos")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "codigo_producto")
    Integer id;
    
    @Column(name= "nombre_producto")
    String name;
    
    @ManyToOne
    @JoinColumn(name= "codigo_categoria")
    CategoryEntity category;
    
    @OneToMany(mappedBy= "products")
    List<SellsEntity> sell;

    public ProductsEntity() {
    }

    public ProductsEntity(String name, CategoryEntity category) {
        this.name = name;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public List<SellsEntity> getSell() {
        return sell;
    }

    public void setSell(List<SellsEntity> sell) {
        this.sell = sell;
    }
    
    
}
