/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.springinitrenderdrone2.renderdrone2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResultaatNietGevondenException extends RuntimeException {

  ResultaatNietGevondenException (){
 super("resultaat niet gevonden.");
 }
 
}
