package com.desafioFinal.ForumHub.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;
@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataDeCriacao;
    private Boolean estadoTopico;
    private String autor;
    private String curso;

    public Topico(DadosCadastroTopico dados){
        this.titulo = dados.titulo();
        if(dados.mensagem() != null){
            this.mensagem = dados.mensagem();
        }
        this.dataDeCriacao = LocalDateTime.now();
        this.estadoTopico = true;
        this.autor = dados.autor();
        this.curso = dados.curso();
    }


    public void atualizarInformacoes(DadosAtualizacaoTopico dados){
        if(dados.titulo() != null){
            this.titulo = dados.titulo();
        }
        if(dados.mensagem() != null){
            this.mensagem = dados.mensagem();
        }
    }



    public void excluir(){
        this.estadoTopico = false;
    }


}
