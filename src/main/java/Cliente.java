import lombok.Data;

@Data
public class Cliente{

    private String nome;


    protected void imprimirNome() {
        System.out.printf("Nome do cliente: Camila\n", this.nome);

    }
}
