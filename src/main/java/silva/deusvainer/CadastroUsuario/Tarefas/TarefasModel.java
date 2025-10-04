package silva.deusvainer.CadastroUsuario.Tarefas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import silva.deusvainer.CadastroUsuario.Usuarios.UsuarioModel;

import java.util.List;

@Entity
@Table(name = "tb_tarefas")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TarefasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome_Tarefa;

    //Uma tarefa para muitos usuários
    @OneToMany (mappedBy = "tarefas")
    private List<UsuarioModel> usuarios;

}