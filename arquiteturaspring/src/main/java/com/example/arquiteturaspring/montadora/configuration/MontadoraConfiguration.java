package com.example.arquiteturaspring.montadora.configuration;

import com.example.arquiteturaspring.montadora.service.Motor;
import com.example.arquiteturaspring.montadora.service.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    //@Primary
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("xpt8-0");
        motor.setTipo(TipoMotor.ASPIRADO);
        motor.setLitragem(2.0);
        return motor;

    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setModelo("TH-10");
        motor.setTipo(TipoMotor.ELETRICO);
        motor.setLitragem(1.0);
        return motor;

    }



    @Bean("motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setModelo("XPTO-10");
        motor.setTipo(TipoMotor.TURBO);
        motor.setLitragem(1.5);
        return motor;

    }
}
