package pedro.deus.al.infnet.AppEnergyFree.model.domain;

public class Heolica extends Produto {

	private float Wats;
	private int TempoDeInstalacao;
	
	@Override
	public String toString() {
		return String.format("%s - %s.2f - %s", super.toString(), Wats, TempoDeInstalacao);
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
	
}
