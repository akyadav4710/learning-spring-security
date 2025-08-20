package com.learning.springSecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
@Id
private Integer Id;
private String username;
private String password;
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Users [Id=" + Id + ", username=" + username + ", password=" + password + "]";
}

}
