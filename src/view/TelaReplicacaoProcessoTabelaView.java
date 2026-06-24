package view;

import database.model.TB_REPLICACAO_DIRECAO;

import javax.swing.*;

public class TelaReplicacaoProcessoTabelaView extends JFrame {

    private JTextField txfId;
    private JComboBox<TB_REPLICACAO_DIRECAO> cboProcesso;
    private JTextField txfTabelaOrigem;
    private JTextField txfTabelaDestino;
    private JTextField txfOrdem;
    private JCheckBox chkHabilitado;
    private JTextArea txfWhere;

    private JButton btnSalvar;
    private JButton btnAdicionar;
    private JButton btnBuscar;
    private JButton btnExcluir;

    public TelaReplicacaoProcessoTabelaView() {
        setTitle("Cadastro De Tabela");
        setSize(720, 420);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        btnBuscar = new JButton("BUSCAR");
        btnAdicionar = new JButton("ADICIONAR");
        btnSalvar = new JButton("SALVAR");
        btnExcluir = new JButton("EXCLUIR");

        btnBuscar.setBounds(10, 10, 130, 30);
        btnAdicionar.setBounds(150, 10, 130, 30);
        btnSalvar.setBounds(290, 10, 130, 30);
        btnExcluir.setBounds(430, 10, 130, 30);

        getContentPane().add(btnBuscar);
        getContentPane().add(btnAdicionar);
        getContentPane().add(btnSalvar);
        getContentPane().add(btnExcluir);

        // --- CAMPO: ID ---
        JLabel lblId = new JLabel("ID");
        lblId.setBounds(10, 70, 140, 25);
        getContentPane().add(lblId);

        txfId = new JTextField();
        txfId.setBounds(160, 70, 200, 25);
        getContentPane().add(txfId);

        // --- CAMPO: Processo ---
        JLabel lblProcesso = new JLabel("Processo");
        lblProcesso.setBounds(10, 105, 140, 25);
        getContentPane().add(lblProcesso);

        cboProcesso = new JComboBox<>();
        cboProcesso.setBounds(160, 105, 420, 25);
        getContentPane().add(cboProcesso);

        // --- CAMPO: Tabela Origem ---
        JLabel lblTabelaOrigem = new JLabel("Tabela Origem");
        lblTabelaOrigem.setBounds(10, 140, 140, 25);
        getContentPane().add(lblTabelaOrigem);

        txfTabelaOrigem = new JTextField();
        txfTabelaOrigem.setBounds(160, 140, 420, 25);
        getContentPane().add(txfTabelaOrigem);

        // --- CAMPO: Tabela Destino ---
        JLabel lblTabelaDestino = new JLabel("Tabela Destino");
        lblTabelaDestino.setBounds(10, 175, 140, 25);
        getContentPane().add(lblTabelaDestino);

        txfTabelaDestino = new JTextField();
        txfTabelaDestino.setBounds(160, 175, 420, 25);
        getContentPane().add(txfTabelaDestino);

        // --- CAMPO: Ordem ---
        JLabel lblOrdem = new JLabel("Ordem");
        lblOrdem.setBounds(10, 210, 140, 25);
        getContentPane().add(lblOrdem);

        txfOrdem = new JTextField();
        txfOrdem.setBounds(160, 210, 200, 25);
        getContentPane().add(txfOrdem);

        // --- CAMPO: Habilitado ---
        chkHabilitado = new JCheckBox("Habilitado");
        chkHabilitado.setBounds(10, 245, 140, 25);
        getContentPane().add(chkHabilitado);

        // --- CAMPO: Where ---
        JLabel lblWhere = new JLabel("Where");
        lblWhere.setBounds(10, 280, 140, 25);
        getContentPane().add(lblWhere);

        txfWhere = new JTextArea();
        txfWhere.setBounds(160, 280, 420, 60);
        getContentPane().add(txfWhere);

    }

    static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaReplicacaoProcessoTabelaView().setVisible(true));
    }
}
