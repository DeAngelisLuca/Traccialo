package it.deangelis.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Prodotto {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String descrizione;
	private String categoria;
	private Double prezzoAttuale;
														//private Venditore venditore;
														//private Double mediaRecensioni                       POI SI VEDRA'
	@OneToOne
	private Link link;
	@OneToMany
	private List<Variazione> variazioni;

	public Prodotto(String nome,String descrizione,String categoria,Double prezzo) {
		this.variazioni = new ArrayList<>();
		this.nome = nome;
		this.descrizione = descrizione;
		this.categoria = categoria;
		this.prezzoAttuale = prezzo;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Double getPrezzoAttuale() {
		return prezzoAttuale;
	}
	public void setPrezzoAttuale(Double prezzoAttuale) {
		this.prezzoAttuale = prezzoAttuale;
	}
	public List<Variazione> getVariazioni() {
		return variazioni;
	}
	public void setVariazioni(List<Variazione> variazioni) {
		this.variazioni = variazioni;
	}
	public Link getLink() {
		return link;
	}
	public void setLink(Link link) {
		this.link = link;
	}
	
}
