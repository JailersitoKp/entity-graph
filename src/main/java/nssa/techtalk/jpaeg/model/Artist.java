package nssa.techtalk.jpaeg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artist {

  // atributos
  @Id private Integer id;
  private String name;
  private String country;

  // gets y sets
  public Integer getId() {
    return id;
  }
  
  public void setId(Integer id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getCountry() {
    return country;
  }
  
  public void setCountry(String country) {
    this.country = country;
  }

}
