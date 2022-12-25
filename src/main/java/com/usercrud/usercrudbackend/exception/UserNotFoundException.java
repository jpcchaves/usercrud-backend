package com.usercrud.usercrudbackend.exception;

public class UserNotFoundException extends RuntimeException{
  public UserNotFoundException(Long id ){
    super("Não foi encontrado um usuário com o ID informado. " + id);
  }
}
