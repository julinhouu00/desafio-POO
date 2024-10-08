package com.julio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
  private  String nome;
  private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteuddosConcluidos =  new LinkedHashSet<>();

  public void inscreverBootcamp(Bootcamp bootcamp){
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
  }

  public void progradir(){
    Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
if (conteudo.isPresent()){
  this.conteuddosConcluidos.add(conteudo.get());
  this.conteudosInscritos.remove(conteudo.get());
}else {
  System.err.println("Você não está matriculado em nenhum conteúdo!");
}
  }

  public double calcularTotalXp(){
   return this.conteuddosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<Conteudo> getConteudosInscritos() {
    return conteudosInscritos;
  }

  public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
    this.conteudosInscritos = conteudosInscritos;
  }

  public Set<Conteudo> getConteuddosConcluidos() {
    return conteuddosConcluidos;
  }

  public void setConteuddosConcluidos(Set<Conteudo> conteuddosConcluidos) {
    this.conteuddosConcluidos = conteuddosConcluidos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dev dev = (Dev) o;
    return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteuddosConcluidos, dev.conteuddosConcluidos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, conteudosInscritos, conteuddosConcluidos);
  }
}

