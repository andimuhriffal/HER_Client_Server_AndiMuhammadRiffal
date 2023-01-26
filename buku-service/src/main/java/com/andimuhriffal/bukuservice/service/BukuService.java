/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.bukuservice.service;

import com.andimuhriffal.bukuservice.entity.Buku;
import com.andimuhriffal.bukuservice.repository.BukuRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service
public class BukuService {
    @Autowired
    private BukuRepository bukuRepository;
    
    public Buku saveBuku (Buku buku){
        return bukuRepository.save(buku);
    } 
    
    public Buku findBukuById(Long bukuId){
        return bukuRepository.findByBukuId(bukuId);
    }
    
    public List<Buku> getAllBuku(){
        return bukuRepository.findAll();
    }
    
    public void deleteBukuById(Long bukuId){
        bukuRepository.deleteById(bukuId);
    }
    
    public Buku updateBuku(Buku buku){
        return bukuRepository.save(buku);
    }
}
