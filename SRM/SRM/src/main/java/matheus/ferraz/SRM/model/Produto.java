package matheus.ferraz.SRM.model;

import jakarta.persistence.*;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduto;
    private String nome;
    private Double valorOuro;
    private Double valorTibar;
    private Reino fkReino;

    public Produto(String nome, Double valorOuro, Double valorTibar, Reino fkReino) {
        this.nome = nome;
        this.valorOuro = valorOuro;
        this.valorTibar = valorTibar;
        this.fkReino = fkReino;
    }
}
