package it.deangelis.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Variazione {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double prezzo;
	private LocalDateTime DataOra;

	public LocalDateTime getDataOra() {
		return DataOra;
	}
	public void setDataOra(LocalDateTime dataOra) {
		DataOra = dataOra;
	}
	public Double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
