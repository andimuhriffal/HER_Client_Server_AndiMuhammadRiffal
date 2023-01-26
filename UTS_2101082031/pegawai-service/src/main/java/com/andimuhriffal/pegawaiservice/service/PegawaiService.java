/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.pegawaiservice.service;

import com.andimuhriffal.pegawaiservice.entity.Pegawai;
import com.andimuhriffal.pegawaiservice.repository.PegawaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service
public class PegawaiService {
    @Autowired
    private PegawaiRepository PegawaiRepository;
    
    public Pegawai savePegawai(Pegawai pegawai){
        return PegawaiRepository.save(pegawai);
    }
    
    public Pegawai findPegawaiById(Long pegawaiId){
        return PegawaiRepository.findByPegawaiId(pegawaiId);
    }
}
