/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasya.pelangganservice.controller;

import com.tasya.pelangganservice.entity.Pelanggan;
import com.tasya.pelangganservice.service.PelangganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */

@RestController
@RequestMapping("/pelanggan")
public class PelangganController {
    @Autowired
    private PelangganService pelangganService;
    private Long pelangganId;
    
    @PostMapping("/")
    public Pelanggan savePelanggan (@RequestBody Pelanggan pelanggan){
        return pelangganService.savePelanggan(pelanggan);
    }
    @GetMapping("/{id}")
    public Pelanggan findPenjualanById(@PathVariable("id")Long penjualanId){
        return pelangganService.findPelangganById(pelangganId);
    }
}
