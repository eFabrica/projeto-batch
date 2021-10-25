package br.com.service.batch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Autobot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String name;

	@Column
	private String car;

	public Autobot() {
	}

	public Autobot(String name, String car) {
		this.name = name;
		this.car = car;
	}

	@Override
	public String toString() {
		return "Autobot{" + "name='" + name + '\'' + ", car='" + car + '\'' + '}';
	}

}
