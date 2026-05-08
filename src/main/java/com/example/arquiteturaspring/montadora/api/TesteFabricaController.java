package com.example.arquiteturaspring.montadora.api;

import com.example.arquiteturaspring.montadora.service.CarroStatus;
import com.example.arquiteturaspring.montadora.service.Chave;
import com.example.arquiteturaspring.montadora.service.HondaHRV;
import com.example.arquiteturaspring.montadora.service.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    //@Qualifier("motorEletrico")
    @Aspirado
    private Motor motor;


    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
         return  carro.darIgnicao(chave);
    }

}
