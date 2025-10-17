package silva.deusvainer.CadastroUsuario.Usuarios;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class UsuarioController {

    @GetMapping("/primeiramensagem")
    public String primeiraMensagem(){
        return "Primeira mensagem nessa rota.";
    }

    //Criar endpoint para criar usuario
    @PostMapping("/create")
    public String criarUsuario() {
        return "Usuario criado.";
    }
    //Criar endpoint para consultar todos usuarios
    @GetMapping("/all")
    public String mostrarUsuarios () {
        return "Usuarios listados.";
    }
    //Crair endpoint para consultar usuario por id
    @GetMapping("/allid")
    public String mostrarUsuariosId(){
        return "Usuarios ID.";
    }
    //Criar endpoint para atualizar usuario por ID
    @PostMapping("/update")
    public String atualizarUsuario() {
        return "Usuario atualizado.";
    }
    //Criar endpoint para deletar us uario por ID
    @DeleteMapping("/deleteID")
    public String deleteUsuario() {
        return "Usuario deletado, ID:";
    }
}
