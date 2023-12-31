package pedro.deus.al.infnet.AppEnergyFree.model.domain;


import javax.persistence.*;

@Entity
@Table(name = "TProduto")
@Inheritance(strategy = InheritanceType.JOINED)
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private int codigo;
	private float preco;
	private boolean estoque;
	@ManyToOne
	@JoinColumn(name = "idVendedor")
	private Vendedor vendedor;
	@Override
	public String toString() {
		return String.format("%d - %s - %d - %.2f - %s", id, descricao, codigo, preco, estoque);
	}

	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public boolean isEstoque() {
		return estoque;
	}
	public void setEstoque(boolean estoque) {
		this.estoque = estoque;
	}
	public Vendedor getVendedor() {return vendedor;}
	public void setVendedor(Vendedor vendedor) {this.vendedor = vendedor;}
}