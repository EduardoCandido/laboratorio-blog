package com.educandido.springinjecaodinamica.services;

import com.educandido.springinjecaodinamica.interfaces.GeraCurriculo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("GeraCurriculoPdfService")
public class GeraCurriculoPdfService implements GeraCurriculo {
}
