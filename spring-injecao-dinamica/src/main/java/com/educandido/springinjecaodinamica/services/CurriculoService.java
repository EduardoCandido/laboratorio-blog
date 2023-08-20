package com.educandido.springinjecaodinamica.services;

import com.educandido.springinjecaodinamica.interfaces.GeraCurriculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurriculoService {


    @Autowired
    private ListaImplementacaoGeraCurriculo listaImplementacaoGeraCurriculo;

    public String getCurriculo(String tipoArquivo){
        GeraCurriculo geradorCurriculo = listaImplementacaoGeraCurriculo.getGeraCurriculoList().get(tipoArquivo);
        return geradorCurriculo.getTipoArquivo();
    }
}
