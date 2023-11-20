package pedro.deus.al.infnet.AppEnergyFree.model.domain;

public class Informacao {

    private Integer id;
    private String campo;
    private String descricao;

    @Override
    public String toString() {

        return String.format("id (%d) - campo (%s) - descricao (%s)",
                id, campo, descricao
        );
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCampo() {
        return campo;
    }
    public void setCampo(String campo) {
        this.campo = campo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}