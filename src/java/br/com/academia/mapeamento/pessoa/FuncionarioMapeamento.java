/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academia.mapeamento.pessoa;

import br.com.academia.mapeamento.outros.CargoMapeamento;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author 14129883739
 */
@Entity
@Table(name="Funcionario")
public class FuncionarioMapeamento extends PessoaMapeamento implements Serializable{
  
    private CargoMapeamento cargoMapeamneto;
    private int satisfacaoCliente;

    public CargoMapeamento getCargoMapeamneto() {
        return cargoMapeamneto;
    }

    public void setCargoMapeamneto(CargoMapeamento cargoMapeamneto) {
        this.cargoMapeamneto = cargoMapeamneto;
    }

    public int getSatisfacaoCliente() {
        return satisfacaoCliente;
    }

    public void setSatisfacaoCliente(int satisfacaoCliente) {
        this.satisfacaoCliente = satisfacaoCliente;
    }
    
    
    
} 
