/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.andimuhriffal.gajiservice.repository;

import com.andimuhriffal.gajiservice.entity.Gaji;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Acer
 */
@Repository
public interface GajiRepository extends JpaRepository<Gaji, Long>{
    public Gaji findGajiById(Long id);
}
