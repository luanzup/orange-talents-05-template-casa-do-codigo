package br.com.zup.luanalves.casadocodigo.cadastrarAutor.dto;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Component
public class AutorDto {
    @NotNull(message = "O nome não pode ser nulo")
    private String nome;
    @NotNull(message = "O email não pode ser nulo")
    @Email(message = "O email deve ser válido")
    private String email;
    @NotNull(message = "A descrição não pode ser nula.")
    @Size(max = 400, message = "A descrição não deve ter mais de 400 caracteres.")
    private String descricao;

    public AutorDto() {
    }

    public AutorDto(String nome, String email, String descricao) {
        this.nome = nome;
        this.email = email;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDescricao() {
        return descricao;
    }
}
