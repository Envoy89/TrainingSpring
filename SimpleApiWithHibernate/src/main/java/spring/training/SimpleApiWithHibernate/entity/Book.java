package spring.training.SimpleApiWithHibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BookTable")
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String author;
    private double price;
}
