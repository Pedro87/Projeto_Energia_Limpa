package pedro.deus.al.infnet.AppEnergyFree.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TSolar")
public class Solar extends Produto {
	private float Wats;
	private int TempoDeInstalacao;
	private boolean PrecisaFundicao;
	

	@Override
	public String toString() {
		return String.format("%s - %s.2f - %s - %s", super.toString(), Wats, TempoDeInstalacao, PrecisaFundicao);
	}
	
	public float getWats() {
		return Wats;
	}
	public void setWats(float wats) {
		Wats = wats;
	}
	public int getTempoDeInstalacao() {
		return TempoDeInstalacao;
	}
	public void setTempoDeInstalacao(int tempoDeInstalacao) {
		TempoDeInstalacao = tempoDeInstalacao;
	}
	public boolean isPrecisaFundicao() {
		return PrecisaFundicao;
	}

	public void setPrecisaFundicao(boolean precisaFundicao) {
		PrecisaFundicao = precisaFundicao;
	}
}
