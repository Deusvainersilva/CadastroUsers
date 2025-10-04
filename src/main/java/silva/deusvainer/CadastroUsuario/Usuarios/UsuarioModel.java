package silva.deusvainer.CadastroUsuario.Usuarios;

import jakarta.persistence.*;
import silva.deusvainer.CadastroUsuario.Tarefas.TarefasModel;

@Entity //Transforma uma classe meuma entidade do DB.
@Table(name = "tb_cadastro")

public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne //Muitos usuários para uma tarefa
    @JoinColumn(name = "tarefas_id")
    private TarefasModel tarefas;

    public UsuarioModel() {
    }

    public UsuarioModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
