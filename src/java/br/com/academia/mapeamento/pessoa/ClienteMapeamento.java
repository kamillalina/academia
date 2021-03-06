/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academia.mapeamento.pessoa;

import br.com.academia.mapeamento.outros.PlanoMapeamento;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author 14129883739
 */
@Entity
@Table(name="clientes")
public class ClienteMapeamento extends PessoaMapeamento implements Serializable {
    private PlanoMapeamento planoMapeamento;
    @Column(nullable= false)
    private int diaVencimento;

    public PlanoMapeamento getPlanoMapeamento() {
        return planoMapeamento;
    }

    public void setPlanoMapeamento(PlanoMapeamento planoMapeamento) {
        this.planoMapeamento = planoMapeamento;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }
    
    
    
}
