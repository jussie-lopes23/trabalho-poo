/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CONTROLLER;

import MODEL.Cartorio;
import MODEL.Cerimonial;
import MODEL.ClasseInterface;
import MODEL.ConvidadoFamilia;
import MODEL.ConvidadoIndividual;
import MODEL.Evento;
import MODEL.Fornecedor;
import MODEL.Igreja;
import MODEL.Pagamento;
import MODEL.Pessoa;
import MODEL.Presente;
import MODEL.Recado;
import MODEL.Relatorio;
import MODEL.Usuario;
import VIEW.Util;

/**
 *
 * @author Mara
 */
public class DAO {

    private Usuario userLogado;

    private Recado[] recados;
    private Presente[] presentes;
    private Pessoa[] pessoas;
    private Usuario[] usuarios;
    private Fornecedor[] fornecedores;
    private Evento[] eventos;
    private Cerimonial[] cerimoniais;
    private Igreja[] igrejas;
    private Cartorio[] cartorios;
    private ConvidadoIndividual[] convidadosIndividuais;
    private ConvidadoFamilia[] convidadosFamilia;
    private Pagamento[] pagamentos;
    private Relatorio[] relatorios;
    private Object[][] todosOsVetores;
    private Class<?> listaClasses[];
    private String listaNomesClasses[];

    public DAO() {
        this.listaNomesClasses = new String[20];
        this.listaNomesClasses[0] = "RECADOS";
        this.listaNomesClasses[1] = "PRESENTES";
        this.listaNomesClasses[2] = "PESSOA";
        this.listaNomesClasses[3] = "USUÁRIOS";
        this.listaNomesClasses[4] = "FORNECEDOR";
        this.listaNomesClasses[5] = "EVENTO";

        this.listaNomesClasses[6] = "CERIMONIAL";
        this.listaNomesClasses[7] = "IGREJA";
        this.listaNomesClasses[8] = "CARTÓRIO";
        this.listaNomesClasses[9] = "CONVIDADO INDIVIDUAL";
        this.listaNomesClasses[10] = "CONVIDADO FAMÍLIA";
        this.listaNomesClasses[11] = "PAGAMENTO";
        this.listaNomesClasses[12] = "RELATÓRIOS";

        this.listaClasses = new Class<?>[]{
            Recado.class, // RECADOS        0
            Presente.class, // PRESENTES    1
            Pessoa.class, // PESSOA         2
            Usuario.class, // USUÁRIOS      3
            Fornecedor.class, // FORNECEDOR 4
            Evento.class, // EVENTO         5
            Cerimonial.class, // CERIMONIAL 6
            Igreja.class, // IGREJA         7
            Cartorio.class, // CARTÓRIO     8
            ConvidadoIndividual.class, // CONVIDADO INDIVIDUAL 9
            ConvidadoFamilia.class, // CONVIDADO FAMÍLIA 10
            Pagamento.class, // PAGAMENTO 11
            Relatorio.class // RELATÓRIOS 12
        };

        recados = new Recado[10];            // Por exemplo, vetor com 10 elementos
        presentes = new Presente[10];
        pessoas = new Pessoa[10];
        usuarios = new Usuario[10];
        fornecedores = new Fornecedor[10];
        eventos = new Evento[10];
        cerimoniais = new Cerimonial[10];
        igrejas = new Igreja[10];
        cartorios = new Cartorio[10];
        convidadosIndividuais = new ConvidadoIndividual[10];
        convidadosFamilia = new ConvidadoFamilia[10];
        pagamentos = new Pagamento[10];
        relatorios = new Relatorio[10];
        this.todosOsVetores = new Object[][]{
            recados,//0
            presentes,//1
            pessoas,//2
            usuarios,//3
            fornecedores,//4
            eventos,//5
            cerimoniais,//6
            igrejas,//7
            cartorios,//8
            convidadosIndividuais,//9
            convidadosFamilia,//10
            pagamentos,//11
            relatorios//12
        };
        this.addInfosIniciais();
    }

    public void addInfosIniciais() {
        Object[] pessoa1Dados = {"ADMINISTRADOR", "7777 5555", "ADMIN", "01/01/2001"};
        Pessoa pessoa1 = new Pessoa();
        pessoa1.criar(pessoa1Dados);
        this.addVetor(2, pessoa1);

        Object[] pessoa2Dados = {"José", "3432 2556", "NOIVO", "01/01/2001"};
        Pessoa pessoa2 = new Pessoa();
        pessoa2.criar(pessoa2Dados);
        this.addVetor(2, pessoa2);

        Object[] pessoa3Dados = {"Maria", "3431 1335", "NOIVA", "01/01/2001"};
        Pessoa pessoa3 = new Pessoa();
        pessoa3.criar(pessoa3Dados);
        this.addVetor(2, pessoa3);

        Object[] pessoa4Dados = {"Ana", "3431 1335", "convidado", "01/01/2001"};
        Pessoa pessoa4 = new Pessoa();
        pessoa4.criar(pessoa4Dados);
        this.addVetor(2, pessoa4);

        Usuario user1 = new Usuario();
        Object[] userDados1 = {1, "admin", "1234", 1, pessoa1};
        user1.trocarPessoa(1, pessoa1);
        user1.criar(userDados1);

        this.addVetor(3, user1);

        Object[] fornecedorBuffet = {"Buffet Delicioso", "12.345.678/0001-99", "(34) 1234-5678", 15000.0, 5, "em aberto"};
        Fornecedor buffet = new Fornecedor();
        buffet.criar(fornecedorBuffet);
        this.addVetor(4, buffet);

        Object[] fornecedorDecoracao = {"Flores e Cores Decoração", "98.765.432/0001-11", "(34) 9876-5432", 8000.0, 3, "pago"};
        Fornecedor decoracao = new Fornecedor();
        decoracao.criar(fornecedorDecoracao);
        this.addVetor(4, decoracao);

        Object[] fornecedorFotografia = {"Momentos Eternos Fotografia", "11.223.344/0001-22", "(34) 1122-3344", 5000.0, 2, "em aberto"};
        Fornecedor fotografia = new Fornecedor();
        fotografia.criar(fornecedorFotografia);
        this.addVetor(4, fotografia);

        Object[] fornecedorMusica = { "Som & Luz Banda", "22.334.556/0001-33", "(34) 2233-4455", 7000.0, 4, "pago"};
        Fornecedor musica = new Fornecedor();
        musica.criar(fornecedorMusica);
        this.addVetor(4, musica);

        Object[] fornecedorConvites = {"Convites Perfeitos", "33.445.667/0001-44", "(34) 3344-5566", 2000.0, 1, "em aberto"};
        Fornecedor convites = new Fornecedor();
        convites.criar(fornecedorConvites);
        this.addVetor(4, convites);

        // Exemplo de igrejas para o casamento
        Object[] igrejaDados1 = {"Igreja Matriz", "Rua das Flores, 123"};
        Igreja igreja1 = new Igreja();
        igreja1.criar(igrejaDados1);
        this.addVetor(7, igreja1);

        Object[] igrejaDados2 = {"Capela São José", "Avenida Central, 456"};
        Igreja igreja2 = new Igreja();
        igreja2.criar(igrejaDados2);
        this.addVetor(7, igreja2);

        Object[] igrejaDados3 = {"Igreja Nossa Senhora das Graças", "Praça das Palmeiras, 789"};
        Igreja igreja3 = new Igreja();
        igreja3.criar(igrejaDados3);
        this.addVetor(7, igreja3);

        // Exemplo de cartórios para o casamento
        Object[] cartorioDados1 = {"Cartório Central", "(34) 1234-5678", "Avenida Brasil, 100"};
        Cartorio cartorio1 = new Cartorio();
        cartorio1.criar(cartorioDados1);
        this.addVetor(8, cartorio1);

        Object[] cartorioDados2 = {"Cartório do Povo", "(34) 8765-4321", "Rua da Independência, 200"};
        Cartorio cartorio2 = new Cartorio();
        cartorio2.criar(cartorioDados2);
        this.addVetor(8, cartorio2);

        Object[] cartorioDados3 = {"Cartório e Registro São José", "(34) 5678-1234", "Praça da República, 300"};
        Cartorio cartorio3 = new Cartorio();
        cartorio3.criar(cartorioDados3);
        this.addVetor(8, cartorio3);

    }

    public Recado[] getRecados() {
        return recados;
    }

    public void setRecados(Recado[] recados) {
        this.recados = recados;
    }

    public Presente[] getPresentes() {
        return presentes;
    }

    public void setPresentes(Presente[] presentes) {
        this.presentes = presentes;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public Fornecedor[] getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(Fornecedor[] fornecedores) {
        this.fornecedores = fornecedores;
    }

    public Evento[] getEventos() {
        return eventos;
    }

    public void setEventos(Evento[] eventos) {
        this.eventos = eventos;
    }

    public Cerimonial[] getCerimoniais() {
        return cerimoniais;
    }

    public void setCerimoniais(Cerimonial[] cerimoniais) {
        this.cerimoniais = cerimoniais;
    }

    public Igreja[] getIgrejas() {
        return igrejas;
    }

    public void setIgrejas(Igreja[] igrejas) {
        this.igrejas = igrejas;
    }

    public Cartorio[] getCartorios() {
        return cartorios;
    }

    public void setCartorios(Cartorio[] cartorios) {
        this.cartorios = cartorios;
    }

    public ConvidadoIndividual[] getConvidadosIndividuais() {
        return convidadosIndividuais;
    }

    public void setConvidadosIndividuais(ConvidadoIndividual[] convidadosIndividuais) {
        this.convidadosIndividuais = convidadosIndividuais;
    }

    public ConvidadoFamilia[] getConvidadosFamilia() {
        return convidadosFamilia;
    }

    public void setConvidadosFamilia(ConvidadoFamilia[] convidadosFamilia) {
        this.convidadosFamilia = convidadosFamilia;
    }

    public Pagamento[] getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Pagamento[] pagamentos) {
        this.pagamentos = pagamentos;
    }

    public Relatorio[] getRelatorios() {
        return relatorios;
    }

    public void setRelatorios(Relatorio[] relatorios) {
        this.relatorios = relatorios;
    }

    public Object[][] getTodosOsVetores() {
        return this.todosOsVetores;
    }

    public void setTodosOsVetores(Object[][] todosOsVetores) {
        this.todosOsVetores = todosOsVetores;
    }

    public Class<?>[] getListaClasses() {
        return listaClasses;
    }

    public void setListaClasses(Class<?>[] listaClasses) {
        this.listaClasses = listaClasses;
    }

    public Object[] getVetorById(int id) {
        return this.todosOsVetores[id];
    }

    public String getNameClasseById(int idClasse) {
        return this.listaNomesClasses[idClasse];
    }

    public int getTotalClasse(int idClasse) {
        int n = 0;

        for (int i = 0; i < this.getVetorById(idClasse).length; i++) {
            if (this.getVetorById(idClasse)[i] != null) {
                n++;
            }
        }

        return n;
    }

    public String getTexto(int idClasse) {
        System.out.println("LENDO CLASSE DE ID " + idClasse);
        System.out.println("");
        String texto = this.listaNomesClasses[idClasse] + " JÁ CADASTRADOS";
        if (this.getTotalClasse(idClasse) > 1) {
            texto += "\nTotal: " + this.getTotalClasse(idClasse) + " itens\n\n";
        } else if (this.getTotalClasse(idClasse) == 1) {
            texto += "\nTotal: " + this.getTotalClasse(idClasse) + " item\n\n";
        }

        if (this.getTotalClasse(idClasse) > 0 && this.getTotalClasse(idClasse) <= 5) {
            Object[] vetor = this.getVetorById(idClasse);
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] != null) {
                    System.out.println("ITEM NÃO NULO");
                    if (vetor[i] instanceof ClasseInterface) {

                        int id = ((ClasseInterface) vetor[i]).getId();
                        System.out.println("LENDO ITEM DE ID " + id);
                        texto += ((ClasseInterface) vetor[i]).ler();
                        System.out.println("LENDO TEXTO  ");
                    }

                }
            }
        } else if (this.getTotalClasse(idClasse) > 5) {
            texto += this.getNomes(idClasse);
        } else {
            texto += "\n\nNENHUM ITEM ENCONTRADO!\n";
        }

        return texto;
    }

    public Class<?> getClasseByID(int idClasse) {
        System.out.println("LENDO A CLASSE DE ID " + idClasse + " e nome " + this.getNameClasseById(idClasse));
        return this.listaClasses[idClasse];
    }

    public void cadastrar(int idClasse, Object infos[], Usuario userLogado) {
        boolean criado = false;
        System.out.println("ADICIONANDO NO VETOR DA CLASSE DE ID " + idClasse);
        System.out.println("CLASSE NOME: " + this.getNameClasseById(idClasse));
        try {
            // Obtém a classe correspondente ao idClasse
            Class<?> classe = this.listaClasses[idClasse];

            // Cria uma nova instância da classe
            ClasseInterface objeto = (ClasseInterface) classe.getDeclaredConstructor().newInstance();
            System.out.println("CRIANDO O OBJETO");
            // Chama o método criar com as informações fornecidas

            if (idClasse == 3) {
                System.out.println("usuario detectado");

                int idPessoa = Util.stringToInt((String) infos[0]);
                System.out.println("ID DA PESSOA " + idPessoa);
                Pessoa pessoa = (Pessoa) this.getItemByID(2, idPessoa);
                System.out.println("NOME: " + pessoa.getNome());
                if (pessoa != null) {

                    if (!pessoa.isUserVinculado()) {
                        System.out.println("Pessoa não tem usuario vinculado");
                        Usuario user = (Usuario) objeto;
                        System.out.println("Trocando pessoa do usuario");
                        user.trocarPessoa(idPessoa, pessoa);
                        System.out.println("criando usuario");
                        criado = user.criar(userLogado, infos);
                    } else {
                        Util.mostrarErro("A conta de usuário de " + pessoa.getNome() + " já existe!");
                    }

                } else {
                    Util.mostrarErro("Pessoa de id " + infos[0] + " não encontrada");

                }
            } else if (idClasse == 11) {

                int idPessoa = Util.stringToInt((String) infos[0]);
                System.out.println("pagamento detectado, encontrando pessoa de id " + idPessoa);
                Pessoa pessoa = (Pessoa) this.getItemByID(2, idPessoa);
                System.out.println("Pessoa encontrada " + pessoa.getNome());
                if (pessoa != null) {
                    System.out.println("CRIANDO OBJETO PAGAMENTO ");
                    Pagamento pagamento = (Pagamento) objeto;
                    System.out.println("Definindo a pessoa");
                    pagamento.trocarPessoa(idPessoa, pessoa);
                    int idFornecedor = Util.stringToInt((String) infos[1]);
                    System.out.println("pagamento detectado, encontrando fornecedor de id " + idFornecedor);
                    if (idFornecedor != 0) {
                        Fornecedor fornecedor = (Fornecedor) this.getItemByID(4, idFornecedor);
                        System.out.println("fornecedor encontrada " + fornecedor.getNome());
                        if (fornecedor != null) {
                            pagamento.trocarFornecedor(idFornecedor, fornecedor);
                            criado = pagamento.criar(userLogado, infos);
                        }
                    } else {
                        criado = pagamento.criar(userLogado, infos);
                    }

                } else if (idClasse == 5) {
                    System.out.println("novo evento detectado");

                    Pessoa noiva = this.getNoivos(1);
                    Pessoa noivo = this.getNoivos(0);

                    int idIgreja = Util.stringToInt((String) infos[1]);
                    Igreja igreja = (Igreja) this.getItemByID(7, idIgreja);

                    int idCartorio = Util.stringToInt((String) infos[2]);
                    Cartorio cartorio = (Cartorio) this.getItemByID(8, idCartorio);

                    int idCerimonial = Util.stringToInt((String) infos[3]);
                    Cerimonial cerimonial = (Cerimonial) this.getItemByID(6, idCerimonial);
                    if (noiva != null && noivo != null) {
                        Evento evento = (Evento) objeto;

                        evento.setNoiva(noiva);
                        evento.setNoivo(noivo);

                        evento.setIgreja(igreja);
                        evento.setCartorio(cartorio);
                        evento.setCerimonial(cerimonial);

                        criado = evento.criar(userLogado, infos);
                    }

                }else if (idClasse == 9){
                     
                System.out.println("usuario detectado");

                int idPessoa1 = Util.stringToInt((String) infos[0]);
                System.out.println("ID DA PESSOA " + idPessoa1);
                Pessoa pessoa = (Pessoa) this.getItemByID(2, idPessoa1);
                System.out.println("NOME: " + pessoa.getNome());
                if (pessoa != null) {

                    if (!pessoa.isUserVinculado()) {
                        System.out.println("Pessoa não tem usuario vinculado");
                        Usuario user = (Usuario) objeto;
                        System.out.println("Trocando pessoa do usuario");
                        user.trocarPessoa(idPessoa, pessoa);
                        System.out.println("criando usuario");
                        criado = user.criar(userLogado, infos);
                    } else {
                        Util.mostrarErro("A conta de usuário de " + pessoa.getNome() + " já existe!");
                    }

                } else {
                    Util.mostrarErro("Pessoa de id " + infos[0] + " não encontrada");

                }
                }else {
                    Util.mostrarErro("Pessoa de id " + infos[0] + " não encontrada");

                }
            } else {
                criado = objeto.criar(userLogado, infos);
            }
            System.out.println("criado: " + criado);
            if (criado) {
                System.out.println("add no vetor");
                // Adiciona o objeto ao vetor correspondente
                boolean adicionado = this.addVetor(idClasse, objeto);

                if (adicionado) {
                    Util.mostrarMSG("Cadastrado com sucesso!");
                } else {
                    Util.mostrarErro("Não foi possível realizar o cadastro!");
                }
            } else {
                Util.mostrarErro("Não foi possível realizar o cadastro!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO AO CRIAR O OBJETO: " + e.getMessage());
        }
    }

    public void atualizar(int idClasse, Object infos[]) {
        int id = Util.stringToInt((String) infos[0]);
        if (id != 0) {
            if (this.find(idClasse, id)) {
                ClasseInterface objeto = this.getItemByID(idClasse, id);
                //------------------USUARIOS------------------
                if (idClasse == 3) {
                    Usuario user = (Usuario) objeto;
                    if (infos[1] != null) {
                        int idPessoa = Util.stringToInt((String) infos[1]);
                        Pessoa pessoa = (Pessoa) this.getItemByID(2, idPessoa);
                        if (pessoa != null) {
                            //checa se a pessoa já não está vinculada a outro usuário
                            if (!pessoa.isUserVinculado() || user.getIdPessoa() == pessoa.getId()) {
                                user.trocarPessoa(idPessoa, pessoa);
                                user.update(infos);
                            } else {
                                Util.mostrarErro("Pessoa " + pessoa.getNome() + " já está vinculada a conta de usuário!");
                            }
                        }
                    } else {
                        System.out.println("ATUALIZANDO ITEM");
                        user.update(infos);
                    }
                } //------------------CERIMONIAL------------------
                //------------------PAGAMENTOS------------------
                else if (idClasse == 11 || infos[2].equals('0')) {
                    System.out.println("convertendo pagamento");
                    Pagamento pagamento = (Pagamento) objeto;
                    if (infos[1] != null || !infos[1].equals('0')) {
                        System.out.println("Coletando o id da pessoa");
                        int idPessoa = Util.stringToInt((String) infos[1]);
                        Pessoa pessoa = (Pessoa) this.getItemByID(2, idPessoa);
                        if (pessoa != null) {
                            pagamento.trocarPessoa(idPessoa, pessoa);
                        }
                    }

                    if (infos[2] != null || !infos[2].equals('0')) {
                        System.out.println("ATUALIZANDO FORNECEDOR");
                        int idFornecedor = Util.stringToInt((String) infos[2]);

                        // Obtém o fornecedor pelo ID
                        Fornecedor fornecedor = (Fornecedor) this.getItemByID(4, idFornecedor);
                        if (fornecedor != null) {
                            pagamento.trocarFornecedor(idFornecedor, fornecedor);
                            System.out.println("Fornecedor associado com sucesso.");
                        } else {
                            System.out.println("Fornecedor não encontrado para o ID: " + idFornecedor);
                        }
                    }
                    pagamento.update(infos);

                } //------------------EVENTOS------------------
                //------------------OUTRAS CLASSES------------------
                else {
                    objeto.update(infos);
                }
            } else {
                Util.mostrarErro("NÃO ENCONTRADO");
            }
        }

    }

    public boolean addVetor(int idClasse, Object ob) {
        Object[] vetor = this.getVetorById(idClasse);
        System.out.println("ADICIONANDO NO VETOR");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Percorrendo vetor");
            if (vetor[i] == null) {
                System.out.println("ITEM NULO ");
                vetor[i] = ob;
                return true;
            }
        }
        return false;
    }

    public boolean remove(int idClasse, Object ob) {
        Object[] vetor = this.getVetorById(idClasse);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == ob) {
                vetor[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean find(int idClasse, int id) {
        Object[] vetor = this.getVetorById(idClasse);
        for (int i = 0; i < vetor.length; i++) {
            // Verifica se o item não é nulo e se implementa a interface
            if (vetor[i] != null && vetor[i] instanceof ClasseInterface) {
                ClasseInterface item = (ClasseInterface) vetor[i]; // Faz o cast
                if (item.getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    public ClasseInterface getItemByID(int idClasse, int id) {
        Object[] vetor = this.getVetorById(idClasse);
        for (int i = 0; i < vetor.length; i++) {
            // Verifica se o item não é nulo e se implementa a interface
            if (vetor[i] != null && vetor[i] instanceof ClasseInterface) {
                ClasseInterface item = (ClasseInterface) vetor[i]; // Faz o cast
                if (item.getId() == id) {
                    return item; // Retorna como ClasseInterface
                }
            }
        }
        return null;
    }

    public boolean delItemByID(int idClasse, int id) {
        System.out.println("DELETANDO ITEM " + id + " DA CLASSE DE ID " + idClasse);
        System.out.println("NOME DA CLASSE " + this.getNameClasseById(idClasse));
        Object[] vetor = this.getVetorById(idClasse);
        System.out.println("vetor pego");
        for (int i = 0; i < vetor.length; i++) {
            // Verifica se o item não é nulo e se implementa a interface
            if (vetor[i] != null && vetor[i] instanceof ClasseInterface) {
                System.out.println("verificado!");
                ClasseInterface item = (ClasseInterface) vetor[i]; // Faz o cast
                if (item.getId() == id) {
                    item.deletar();
                    System.out.println("elemento encontrado");
                    vetor[i] = null; // Remove o item
                    System.out.println("elemento apagado");

                    return true;
                }
            }
        }
        return false;
    }

    public Pessoa getNoivos(int noiva) {
        Pessoa p = null;
        int n = 0;
        Pessoa vPessoas[] = (Pessoa[]) this.todosOsVetores[2];
        for (int i = 0; i < vPessoas.length; i++) {
            if (vPessoas[i] != null) {
                if ((noiva == 1 && vPessoas[i].getTipo().equals("NOIVA"))
                        || (noiva == 0 && vPessoas[i].getTipo().equals("NOIVO"))) {
                    p = vPessoas[i];
                    n++;
                }
            }
        }
        if (n == 0) {
            return null;
        }
        return p;
    }

    public String getNoivo(int noiva) {
        String texto = "";
        int n = 0;
        Pessoa vPessoas[] = (Pessoa[]) this.todosOsVetores[2];
        for (int i = 0; i < vPessoas.length; i++) {
            if (vPessoas[i] != null) {
                if ((noiva == 1 && vPessoas[i].getTipo().equals("NOIVA"))
                        || (noiva == 0 && vPessoas[i].getTipo().equals("NOIVO"))) {
                    texto += "\nID: " + vPessoas[i].getId() + "\nNome: " + vPessoas[i].getNome();
                    texto += "\n";
                    n++;
                }
            }
        }
        if (n == 0) {
            texto = "\nNenhum(a) noivo(a) encontrado!";
        }
        return texto;
    }

    public String getTextoNoivos() {
        String texto = "\n                    ";
        int n = 0;
        Pessoa vPessoas[] = (Pessoa[]) this.todosOsVetores[2];
        for (int i = 0; i < vPessoas.length; i++) {
            if (vPessoas[i] != null && (vPessoas[i].getTipo().equals("NOIVO")
                    || vPessoas[i].getTipo().equals("NOIVA"))) {
                texto += vPessoas[i].getNome();
                if (n == 0) {
                    texto += " ❤ ";
                }
                n++;
            }
        }
        return texto;
    }

    public String getNomes(int idClasse) {
        String texto = "\n                    ";

        ClasseInterface[] vObj = (ClasseInterface[]) this.todosOsVetores[idClasse];
        int c = 0;
        for (int i = 0; i < vObj.length; i++) {
            if (vObj[i] != null) {
                texto += "\nID: " + vObj[i].getId() + "\nNome: " + vObj[i].getNome();
                texto += "\n";
                c++;
            }
        }

        if (c == 0) {
            texto = "\n\nNenhum cadastrado encontrado!\n\n";
        }
        return texto;
    }

    public String getNomesPessoasSemUsers() {
        String texto = "\n                    ";
        Pessoa vPessoas[] = (Pessoa[]) this.todosOsVetores[2];
        Usuario vUsers[] = (Usuario[]) this.todosOsVetores[3];
        boolean userVinculado = false;
        int c = 0;
        for (int i = 0; i < vPessoas.length; i++) {
            if (vPessoas[i] != null) {
                if (!vPessoas[i].isUserVinculado()) {
                    texto += "\nID: " + vPessoas[i].getId() + "\nNome: " + vPessoas[i].getNome() + "\nTipo: " + vPessoas[i].getTipo();
                    c++;
                    texto += "\n";
                }
            }
        }

        if (c == 0) {
            texto = "\n\nNENHUMA PESSOA CADASTRADA SEM USUÁRIO VINCULADO!\n\n";
        }
        return texto;
    }

    public String getPresentesEscolhidos(Usuario user) {
        String texto = "\n                    ";
        Presente vPresente[] = (Presente[]) this.todosOsVetores[1];

        int c = 0;
        for (int i = 0; i < vPresente.length; i++) {
            if (vPresente[i] != null) {
                if (vPresente[i].getIdPessoa() == user.getIdPessoa()) {
                    texto += "\nID: " + vPresente[i].getId() + "\nNome: " + vPresente[i].getNome() + "\nLink: " + vPresente[i].getLink();
                    if (vPresente[i].isComprado()) {
                        texto += "\nComprado: SIM";

                    } else {
                        texto += "\nComprado: NÃO";
                    }
                    c++;
                    texto += "\n";
                }
            }
        }

        if (c == 0) {
            texto = "\n\nNenhum presente escolhido por você!\n\n";
        }
        return texto;
    }

    public Usuario getUser(String user) {

        System.out.println("Procurando usuario " + user);
        Usuario vUsers[] = (Usuario[]) this.todosOsVetores[3];
        for (int i = 0; i < vUsers.length; i++) {

            if (vUsers[i] != null && vUsers[i].getLogin().equals(user)) {
                System.out.println("usuario encontrado " + user);
                return vUsers[i];
            }
        }
        System.out.println("usuario nao encontrado " + user);
        return null;
    }

    public boolean autentica(String user, String senha) {
        System.out.println("Autenticando usuario " + user + " com senha " + senha);
        Usuario usuario = this.getUser(user);

        if (usuario != null) {
            System.out.println("usuario encontrado " + usuario.getLogin());
            if (usuario.getSenha().equals(senha)) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("usuario nao encontrado " + user);
            return false;
        }
    }
}
