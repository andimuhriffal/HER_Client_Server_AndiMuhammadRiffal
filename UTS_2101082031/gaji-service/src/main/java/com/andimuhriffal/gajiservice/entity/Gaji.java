/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.gajiservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Acer
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gaji {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String nip;
    private String nama;
    private String golongan;
    private int gajiPokok;
    private int tunjangan;
    private int total;
    
    public int getGajiPokok(){
        if (golongan == "3A"){
            gajiPokok = 1000000;
        } else if(golongan == "3B"){
            gajiPokok = 2000000;
        } else {
            gajiPokok = 3000000;
        }
        return gajiPokok;
    }
    
    public int getTunjangan(){
        tunjangan = (int) (0.1 * gajiPokok);
        return tunjangan;
    }
    
    public int getTotal(){
        total = gajiPokok + tunjangan;
        return total;
    }
   
}
