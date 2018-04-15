package it.deangelis.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SistemaTraccialo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private LocalDateTime dataOraAttuale;
	@OneToMany
	private List<Link> links;

	public SistemaTraccialo() {
		this.links = new ArrayList<>();
		this.dataOraAttuale = LocalDateTime.now();
	}

	public LocalDateTime getDataOraAttuale() {
		dataOraAttuale = LocalDateTime.now();
		return dataOraAttuale;
	}
	public void setDataOra(LocalDateTime data) {
		this.dataOraAttuale = data;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}

}
