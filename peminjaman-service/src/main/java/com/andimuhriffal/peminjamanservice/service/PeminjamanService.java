/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.peminjamanservice.service;

import com.andimuhriffal.peminjamanservice.VO.Anggota;
import com.andimuhriffal.peminjamanservice.VO.Buku;
import com.andimuhriffal.peminjamanservice.VO.ResponseTemplateVO;
import com.andimuhriffal.peminjamanservice.entity.Peminjaman;
import com.andimuhriffal.peminjamanservice.repository.PeminjamanRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



/**
 *
 * @author Acer
 */
@Service
public class PeminjamanService {
    @Autowired
    private PeminjamanRepository peminjamanRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Peminjaman savePeminjaman(Peminjaman peminjaman){
        return peminjamanRepository.save(peminjaman);
    }
    
    public ResponseTemplateVO getPeminjaman(Long peminjamanId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Peminjaman peminjaman = 
                peminjamanRepository.findByPeminjamanId(peminjamanId);
        Anggota anggota = 
        restTemplate.getForObject("http://localhost:9001/anggota/"
                + peminjaman.getAnggotaId(), Anggota.class);
        Buku buku = restTemplate.getForObject("http://localhost:9002/buku/" 
                + peminjaman.getBukuId(), Buku.class);
        vo.setPeminjaman(peminjaman);
        vo.setAnggota(anggota); 
        vo.setBuku(buku); 
        return vo;
        
    }
    public Peminjaman findpeminjamanById(Long peminjamanId){
        return peminjamanRepository.findByPeminjamanId(peminjamanId);
    }
    public List<Peminjaman> getAllPeminjaman(){
        return peminjamanRepository.findAll();
    }
    public void deletePeminjamanId(Long peminjamanId){
        peminjamanRepository.deleteById(peminjamanId);
    }
    public Peminjaman updatePeminjaman(Peminjaman peminjaman){
        return peminjamanRepository.save(peminjaman);
    }
}
