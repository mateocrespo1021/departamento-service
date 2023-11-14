package com.loxasoft.departamentservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="departaments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departament {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "name")
  private String name;
  @Column(name = "code")
  private String code;
  
  @Override
  public String toString() {
      return "Departament{" +
             "id=" + id +
             ", nombre='" + name + '\'' +
             ", code='" + code + '\'' +
             '}';
  }
}
