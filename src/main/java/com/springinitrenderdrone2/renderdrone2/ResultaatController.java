/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springinitrenderdrone2.renderdrone2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rafde
 */
@RestController
public class ResultaatController {

    public ResultaatController(ResultaatRequests resultaatRequests) {
        this.resultaatRequests = resultaatRequests;
    }
    private final ResultaatRequests resultaatRequests;
    
    @GetMapping
    Resultaat geefResultaat(){
        return resultaatRequests.geefResultaat();
    }
}
