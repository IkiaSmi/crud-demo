package com.example.cruddemo.entity;

import com.example.cruddemo.dto.UserInstanceDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserEntity {
    @Id
    @GeneratedValue
    public Long id;
    @Column
    public String name;

    public void setName(String name) {
        this.name = name;
    }
}
