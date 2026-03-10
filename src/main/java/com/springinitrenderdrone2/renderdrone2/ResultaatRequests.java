/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.springinitrenderdrone2.renderdrone2;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

/**
 *
 * @author rafde
 */
@HttpExchange("https://drone2.be/geefResultaatBedrijven")
public interface ResultaatRequests {
    @GetExchange
    Resultaat geefResultaat();
}
