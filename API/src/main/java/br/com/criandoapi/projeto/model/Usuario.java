package br.com.criandoapi.projeto.model;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome_Completo",length = 200, nullable = true)
    private String nome_Completo;

    @Column(name = "username",length = 100, nullable = true)
    private String username;
    @Column(name = "email",length = 50, nullable = true)
    private String email;
    @Column(name = "senha", columnDefinition = "TEXT", nullable = true)
    private String senha;
    @Column(name = "telefone",length = 15, nullable = true)
    private String telefone;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome_Completo(String nome_Completo) {
        this.nome_Completo = nome_Completo;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public String getNome_Completo() {
        return nome_Completo;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }
}
