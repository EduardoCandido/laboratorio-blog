package com.educandido.springinjecaodinamica.services;

import com.educandido.springinjecaodinamica.interfaces.GeraCurriculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurriculoService {

    @Autowired
    GeraCurriculo geraCurriculo;
}
