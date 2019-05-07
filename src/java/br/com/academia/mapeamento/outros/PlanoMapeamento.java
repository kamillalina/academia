/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.academia.mapeamento.outros;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 14129883739
 */
@Entity
@Table(name = "planos")
public class PlanoMapeamento implements Serializable{
    @Id
    @GeneratedValue
    private long id;
    
  //campo chamado nome de dados
    @Column(length = 20,nullable= false)   
    private String nome;
    
    //campo chamado descricao de dados
    @Column(nullable= false)
    private String descricao;
    
   //campo chamado valor no banco de daos 
    private double valor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
