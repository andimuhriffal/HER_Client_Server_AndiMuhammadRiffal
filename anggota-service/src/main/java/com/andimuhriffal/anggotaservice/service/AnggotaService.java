/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.anggotaservice.service;

import com.andimuhriffal.anggotaservice.entity.Anggota;
import com.andimuhriffal.anggotaservice.repository.AnggotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service
public class AnggotaService {
    @Autowired
    private AnggotaRepository anggotaRepository;
    
    public Anggota saveAnggota(Anggota anggota){
        return anggotaRepository.save(anggota);
    }
    
    public Anggota findAnggotaById(Long anggotaId){
        return anggotaRepository.findByAnggotaId(anggotaId);
    }
    
    public List<Anggota> getAllAnggota(){
        return anggotaRepository.findAll();
    }
    
    public void deleteAnggotaById(Long anggotaId){
        anggotaRepository.deleteById(anggotaId);
    }
    
    public Anggota updateAnggota(Anggota anggota){
        return anggotaRepository.save(anggota);
    }
}
