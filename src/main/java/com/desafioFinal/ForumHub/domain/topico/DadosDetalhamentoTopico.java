package com.desafioFinal.ForumHub.domain.topico;

public record DadosDetalhamentoTopico(
        Long id,
        String mensagem,
        String autor,
        String curso
) {
    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(), topico.getMensagem() , topico.getAutor() , topico.getCurso());
    }

}
