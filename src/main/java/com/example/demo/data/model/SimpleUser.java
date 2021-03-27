package com.example.demo.data.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "simple_users")
@DynamicInsert
@DynamicUpdate
public class SimpleUser implements Serializable
{
    private static final long serialVersionUID = 1L;

    // Columns
    protected Long id;
    protected String username;
    protected LocalDateTime createdAt;
    //...

    // Constructors
    public SimpleUser () { /** Default copy constructor */ }
    public SimpleUser (Long id, String username, LocalDateTime createdAt) {
        this.id = id;
        this.username = username;
        this.createdAt = createdAt;
    }

    // Getters
    @Id
    @Column(name = "id", updatable = false)
    @JsonProperty("id")
    public Long getId () { return this.id; }

    @Column(name = "username")
    @JsonProperty("username")
    public String getUsername () { return this.username; }

    @Column(name = "created_at")
    @JsonProperty("created_at")
    public LocalDateTime getCreatedAt () { return this.createdAt; }
    
    // Setters

    public void setId (Long value) { this.id = value; }
    public void setUsername (String value) { this.username = value; }
    public void setCreatedAt (LocalDateTime value) { this.createdAt = value; }

}