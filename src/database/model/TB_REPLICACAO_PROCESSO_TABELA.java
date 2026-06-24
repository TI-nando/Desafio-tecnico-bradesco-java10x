package database.model;

public class TB_REPLICACAO_PROCESSO_TABELA {

    private long  id;
    private long processo_id;
    private String table_origem;
    private String table_destino;
    private int ordem;
    private boolean habilitado;
    private String ds_where;

    public TB_REPLICACAO_PROCESSO_TABELA() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProcesso_id() {
        return processo_id;
    }

    public void setProcesso_id(long processo_id) {
        this.processo_id = processo_id;
    }

    public String getTable_origem() {
        return table_origem;
    }

    public void setTable_origem(String table_origem) {
        this.table_origem = table_origem;
    }

    public String getTable_destino() {
        return table_destino;
    }

    public void setTable_destino(String table_destino) {
        this.table_destino = table_destino;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getDs_where() {
        return ds_where;
    }

    public void setDs_where(String ds_where) {
        this.ds_where = ds_where;
    }
}
