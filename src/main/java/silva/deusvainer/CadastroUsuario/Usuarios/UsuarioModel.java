package silva.deusvainer.CadastroUsuario.Usuarios;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import silva.deusvainer.CadastroUsuario.Tarefas.TarefasModel;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
}