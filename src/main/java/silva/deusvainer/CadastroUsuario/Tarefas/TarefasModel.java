package silva.deusvainer.CadastroUsuario.Tarefas;

import jakarta.persistence.*;
import silva.deusvainer.CadastroUsuario.Usuarios.UsuarioModel;

import java.util.List;

@Entity
@Table(name = "tb_tarefas")
public class TarefasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_Tarefa;

    //Uma tarefa para muitos usuários
    @OneToMany (mappedBy = "tarefas")
    private List<UsuarioModel> usuarios;


}
