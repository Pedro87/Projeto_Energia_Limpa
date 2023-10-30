package pedro.deus.al.infnet.AppEnergyFree.model.domain;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "TVendedor")
public class Vendedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	@OneToMany
	private List<Produto> produtos;
	
	@Override
	public String toString() {
		return String.format("%s - %s - %s", nome, cpf, email);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
}
