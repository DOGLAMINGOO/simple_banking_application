package net.javaguides.banking.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//names the table name as 'accounts'
@Table(name="accounts")
//marks or maps the class as a table in the database (creats a JPA entity
@Entity
public class Account {
    //marks the id variable as the pk
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //automatically increments the pk
    private Long id;

    //sets the column name
    @Column(name = "account_holder_name")
    private String accountHolderName;
    private double balance;
}
