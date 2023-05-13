package estudos.alura.audos.modelos;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }

    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
