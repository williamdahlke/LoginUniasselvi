import java.util.Scanner;

public class Main {

	private static String informarUsuario() {
		System.out.println("Digite o seu código de usuário: ");
		Scanner scan = new Scanner(System.in);
		String usuario = scan.next();
		return usuario;
	}
	
	private static String informarSenha() {
		System.out.println("Digite a sua senha: ");
		Scanner scan = new Scanner(System.in);
		String senha = scan.next();
		return senha;		
	}
	
	private static String informarCPF() {
		System.out.println("Digite o seu CPF: ");
		Scanner scan = new Scanner(System.in);
		String cpf = scan.next();
		return cpf;				
	}
	
	private static void verificarLogin(boolean realizouLogin) {
		if (realizouLogin == true) {
			System.out.println("Login realizado com sucesso!");
		}
		else {
			System.out.println("Login não efetuado, seus dados estão incorretos para o acesso.");
		}
	}
		
	public static void main(String[] args) {
			
		int opcao = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Réplica do Sistema de Login da Uniasselvi -----");
		System.out.println("Escolha uma opção para realizar o login: ------");
		System.out.println("1 ------------Acadêmico------------------------");
		System.out.println("2 ------------Acadêmico Sala Virtual ----------");
		System.out.println("3 ------------Colaborador ---------------------");
		System.out.println("4 ------------Empresa--------------------------");
		System.out.println("5-------------Comunidade-----------------------");
		System.out.println();
		System.out.println("Digite a opção desejada: ");
        opcao = scan.nextInt();
        
        String usuario = "";
        String senha = "";
        String cpf = "";
        boolean realizouLogin = false;
        
        switch(opcao) {
        
        case 1:
        
    	Academico academico1 = new Academico();
    	academico1.setCpf("12345678999");
    	academico1.setCurso("Sistemas da Informação");
    	academico1.setEmail("teste@gmail.com");
    	academico1.setLogin("1493956");
    	academico1.setSenha("testeTeste");
    	academico1.setStatus(true);
    	academico1.setTurma("INFOXXX");	
        	
        usuario = Main.informarUsuario();
        senha = Main.informarSenha();
        realizouLogin = academico1.verificarLoginSenha(usuario, senha);
        Main.verificarLogin(realizouLogin);
        break;
        
        case 2:
        AcademicoSalaVirtual academicoSV = new AcademicoSalaVirtual();
        academicoSV.setCpf("12345678999");
        academicoSV.setCurso("Sistemas da Informação");
        academicoSV.setEmail("teste@gmail.com");
        academicoSV.setLogin("1493956");
        academicoSV.setSenha("william");
        academicoSV.setStatus(true);
        academicoSV.setTurma("INFOXXX");
        academicoSV.setEmailUniasselvi("1493956@aluno.uniasselvi.com.br");
        academicoSV.setSenhaTeams("12345678");
        usuario = Main.informarUsuario();
        senha = Main.informarSenha();
        realizouLogin = academicoSV.loginTeams(usuario, senha);
        Main.verificarLogin(realizouLogin);        
        
        break;
        	
        case 3:
        Colaborador colaborador = new Colaborador();
        colaborador.setCpf("1234567899");
        colaborador.setCidade("Blumenau");
        colaborador.setCargo("Programador JAVA");
        colaborador.setEmail("programador@uniasselvi.com.br");
        colaborador.setEstado("SC");
        colaborador.setLogin("1493956");
        colaborador.setNome("William Guilherme");
        colaborador.setSalario(12000.00f);
        colaborador.setSenha("java123");
        colaborador.setSenhaColaborador("");
        colaborador.setSetor("TI");
        usuario = Main.informarUsuario();
        senha = Main.informarSenha();
        cpf = Main.informarCPF();
        realizouLogin = colaborador.verificarLoginSenhaCPF(usuario, senha, cpf);
        Main.verificarLogin(realizouLogin);
        
        break;
        
        case 4: 
        Empresa empresa = new Empresa();
        empresa.setCnpj("82663337000143");
        empresa.setLogin("william");
        empresa.setEmail("william.ti@teste.com.br");
        empresa.setNome("William Corporation");
        empresa.setNumeroAlunosConv(1);
        empresa.setPercentualDesconto(75);
        empresa.setSenha("william123");
        
        usuario = Main.informarUsuario();
        senha = Main.informarSenha();
        realizouLogin = empresa.verificarLoginSenha(usuario, senha);
        Main.verificarLogin(realizouLogin);
        break;
        
        case 5:
        Comunidade comunidade = new Comunidade();
        comunidade.setCpf("106295855543");
        comunidade.setEmail("teste@gmail.com");
        comunidade.setLogin("1493956");
        comunidade.setNome("William");
        comunidade.setSenha("789456123");
        
        usuario = Main.informarUsuario();
        senha = Main.informarSenha();
        cpf = Main.informarCPF();
        realizouLogin = comunidade.verificarLoginSenhaCPF(usuario, senha, cpf);
        Main.verificarLogin(realizouLogin);
        break;
        
        default:
        System.out.println("Informe uma opção válida!");
        }
	}
}
