package com.usercrud.usercrudbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

@Entity
public class User {

  @Id
  @GeneratedValue
  private Long id;

  @NotBlank(message = "O campo é obrigatório!")
  @Pattern(regexp = "^[A-Z]+(.)*", message = "A primeira letra deve ser maiúscula!")
  @Length(max = 12, message = "O nome de usuário pode ter no máximo 12 caracteres.")
  private String username;

  @NotBlank(message = "O campo é obrigatório!")
  @Pattern(regexp = "^[A-Z]+(.)*", message = "A primeira letra deve ser maiúscula!")
  @Length(max = 12, message = "O nome pode ter no máximo 12 caracteres.")
  private String name;

  @Email(message = "Insira um email válido!")
  @NotBlank(message = "O campo é obrigatório!")
  private String email;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
