package com.nelioalves.cursomc.dto;

import com.nelioalves.cursomc.domain.Cliente;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class ClienteDTO  implements Serializable {
    private static final long serialVersionUID= 1L;

    private Integer id;

    @NotEmpty(message = "Preenchimento obg")
    @Length(min=5 , max=120 , message = "tamanaho entr 5  e 8 caract ")
    private String nome;

    @NotEmpty(message = "Preenchimento obg")
    @Email(message = "email invalido")
    private String email;


     public ClienteDTO(Cliente obj){
         id= obj.getId();
         nome= obj.getNome();
         email= obj.getEmail();
     }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
