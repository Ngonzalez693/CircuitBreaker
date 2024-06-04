package com.gonzalez.carro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Carro")
public class Carro {

	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	private String marca;
	private String color;
	private double precio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double price) {
		this.precio = price;
	}
	
	public Carro(int id, String nombre, String marca, String color, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}
	
	public Carro(String nombre, String marca, String color, double precio) {
		this.nombre = nombre;
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}
	
	public Carro() {
		
	}
}
