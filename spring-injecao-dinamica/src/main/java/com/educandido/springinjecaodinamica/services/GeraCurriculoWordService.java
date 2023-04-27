package com.educandido.springinjecaodinamica.services;

import com.educandido.springinjecaodinamica.interfaces.GeraCurriculo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GeraCurriculoWordService implements GeraCurriculo {
}
