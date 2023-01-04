/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasya.penjualanservice.service;

import com.tasya.penjualanservice.entity.Penjualan;
import com.tasya.penjualanservice.repository.PenjualanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */

@Service
public class PenjualanService {
    @Autowired
   private PenjualanRepository penjualanRepository;
   
   public Penjualan savePenjualan (Penjualan penjualan){
       return penjualanRepository.save(penjualan);
    }

    public Penjualan findPenjualanById(Long penjualanId){
        return (Penjualan) penjualanRepository.findByPenjualanId(penjualanId);
    }
}
