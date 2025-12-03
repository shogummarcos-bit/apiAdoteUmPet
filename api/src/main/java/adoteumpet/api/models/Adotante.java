package adoteumpet.api.models;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="adotante")
public class Adotante {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String especie; 

    @Column
    private String raca;

    @Column
    private Integer idade;

    @Column
    private String porte;

    @Column
    private String descricao;

    @Column
    private String vacinas;

    @Column
    private Boolean disponivel;

    @Column
    private LocalDate dataEntrada;

    @Column
    private LocalDate dataAdocao;
}
