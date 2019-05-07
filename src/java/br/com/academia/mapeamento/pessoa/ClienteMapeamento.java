/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academia.mapeamento.pessoa;

import br.com.academia.mapeamento.outros.PlanoMapeamento;
import java.io.Serializable;

/**
 *
 * @author 14129883739
 */
public class ClienteMapeamento extends PessoaMapeamento implements Serializable {
    private PlanoMapeamento planoMapeamento;
    private int diaVencimento;
    
    
    
}
