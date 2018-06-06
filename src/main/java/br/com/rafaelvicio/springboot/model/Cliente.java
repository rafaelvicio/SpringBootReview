package br.com.rafaelvicio.springboot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.Length;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(min=2, max=30,message="O tamanho do nome deve ser entre {min} e {max} caracteres")
    private String nome;

    @NotNull
    @Length(min = 2, max = 300,message="O tamanho do endereço deve ser entre {min} e {max}caracteres")private String endereco;
    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    @Cascade(CascadeType.ALL)
    private List<Pedido> pedidos;

}