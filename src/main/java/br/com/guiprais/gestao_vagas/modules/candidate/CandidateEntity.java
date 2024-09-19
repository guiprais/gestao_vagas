package br.com.guiprais.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {

  private UUID id;
  private String name;

  @Pattern(regexp = "^[a-zA-Z0-9]{3,}$", message = "Usuário inválido")
  private String username;

  @Email(message = "Email inválido")
  private String email;

  @Length(min = 6, message = "Senha deve conter no mínimo 6 caracteres")
  private String password;

  private String description;

  private String curriculum;
}
