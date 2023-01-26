/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.pengembalianservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Acer
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVOpinjam {
    private Peminjaman peminjaman;
    private Anggota anggota;
    private Buku buku;
}
