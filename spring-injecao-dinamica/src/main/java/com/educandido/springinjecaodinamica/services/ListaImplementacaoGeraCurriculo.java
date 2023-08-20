package com.educandido.springinjecaodinamica.services;

import com.educandido.springinjecaodinamica.interfaces.GeraCurriculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ListaImplementacaoGeraCurriculo {

    private final Map<String, GeraCurriculo> geraCurriculoList;

    @Autowired
    ListaImplementacaoGeraCurriculo(List<GeraCurriculo> geraCurriculoList){
        this.geraCurriculoList = geraCurriculoList.stream()
                .collect(Collectors.toMap(GeraCurriculo::getTipoArquivo, Function.identity()));
    }

    public Map<String, GeraCurriculo> getGeraCurriculoList() {
        return geraCurriculoList;
    }
}
