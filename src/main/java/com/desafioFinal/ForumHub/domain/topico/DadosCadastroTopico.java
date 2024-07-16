package com.desafioFinal.ForumHub.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroTopico(
        @NotBlank
        String titulo,
        String mensagem,
        @NotBlank
        String autor,
        @NotBlank
        String curso
) {
}
