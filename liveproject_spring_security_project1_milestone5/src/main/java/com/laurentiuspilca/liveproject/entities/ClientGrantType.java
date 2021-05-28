package com.laurentiuspilca.liveproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@Table(name = "client_grant_types")
public class ClientGrantType {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "grant_type")
  private String grantType;

  @ManyToOne
  @JsonIgnore
  private Client client;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClientGrantType that = (ClientGrantType) o;
    return id == that.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "ClientGrantType{" +
            "id=" + id +
            ", grantType='" + grantType + '\'' +
            ", client=" + client +
            '}';
  }
}
