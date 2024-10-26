/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import CONTROLLER.DAO;
import static MODEL.Pessoa.total;
import static MODEL.Usuario.total;
import VIEW.Util;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author CAUPT - ALUNOS
 */
public class ConvidadoIndividual implements ClasseInterface{
    
    private int id;
    private int idPessoa;
    private Pessoa pessoa;
    private ConvidadoFamilia familia;
    private String parentesco;
    private boolean confirmacao;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;
    public static int totalConvidadoIndividual;
    private DAO dao;
    
  
    
//    public int getId(){
//    
//        return this.id;
//    
//    }
//
//    public void setId(int id){
//        this.id = id;
//    }
//    
//    public LocalDate getDataCriacao(){
//    
//        return this.dataCriacao;
//    
//    }
//
//    public LocalDate getDataModificacao(){
//    
//        return null;
//    
//    }
//
//    public void atualizarDataModificacao(){
//
//    }
//    
//
//    public boolean criar(Usuario user, Object[] vetor) {

//            
//    }
//
//    @Override
//    public void deletar() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//   
//    @Override
//    public void update(Object[] vetor) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    }
//
//    public boolean criar(Object[] vetor) {
//        System.out.println("CRIANDO O CONVIDADO de ID " + vetor[0]);
//        boolean criou = false;
//
//        int idPessoa = (int) vetor[0];
//        int idFamilia = (int) vetor[1];
//        System.out.println("id convertido para inteiro com sucesso");
//      
//        if (vetor[0] != null && vetor[1] != null && vetor[2] != null && vetor[3] != null && vetor[4] != null) {
//            System.out.println("Nenhum campo nulo!");
//            if (idPessoa != 0) {
//                System.out.println("ID DIFERENTE DE ZERO!");
//                System.out.println("Procurando pessoa de id " + vetor[0]);
//                Pessoa pessoa = (Pessoa) vetor[1];
//                if (pessoa != null) {
//                    if (!pessoa.isUserVinculado()) {
//                        if (pessoa != null
//                                && idPessoa == pessoa.getId()
//                                && !pessoa.isUserVinculado()) {
//                            ConvidadoFamilia fml = (ConvidadoFamilia) vetor[2];
//                            if(fml != null){
//                                this.familia = fml;
//                            
//                            }else{
//                                this.familia = null;
//                               
//                            }
//                            this.idPessoa = idPessoa;
//                            this.parentesco = (String) vetor[3];
//                            this.confirmacao = (boolean) vetor[4];
//                            this.dataModificacao = LocalDate.now();
//                            this.dataModificacao = null;
//                            criou = true;
//                        } 
//                    } 
//
//                } else {
//                    System.out.println("Não foi possivel criar o objeto");
//                    Util.mostrarErro("Pessoa de id " + vetor[0] + " não encontrada");
//                }
//
//            }
//
//        }
//        return criou;
//    }
//    
//    public String ler() {
//        
//        StringBuilder resultado = new StringBuilder();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//
//        // Adiciona informações da pessoa
//        resultado.append("comvidado Individual").append(this.id);
//        resultado.append("Pessoa ").append(this.pessoa.getId());
//        resultado.append("\nNome: ").append(this.pessoa.getNome());
//
//        // Verifica e adiciona o parentesco
//        if (this.parentesco != null && !this.parentesco.isEmpty()) {
//            resultado.append("\nParentesco: ").append(this.parentesco);
//        }
//        
//        // Verifica e formata a data de criação
//        if (this.dataCriacao != null) {
//            resultado.append("\nData de Criação: ").append(this.dataCriacao.format(formatter));
//        }
//
//        // Verifica e formata a data de modificação
//        if (this.dataModificacao != null) {
//            resultado.append("\nData da Última Modificação: ").append(this.dataModificacao.format(formatter));
//        }
//
//        resultado.append("\n\n");
//        return resultado.toString();
//    }
//    
//    public void update(Object vetor[]){
//    
//    }
//    
//    @Override
//    public void deletar() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String ler() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deletar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean criar(Object[] vetor) {
        System.out.println("CRIANDO O CONVIDADO de ID " + vetor[0]);
        boolean criou = false;

        int idPessoa = (int) vetor[0];
        System.out.println("id convertido para inteiro com sucesso");
      
        if (vetor[0] != null && vetor[1] != null && vetor[2] != null && vetor[3] != null && vetor[4] != null) {
            System.out.println("Nenhum campo nulo!");
            if (idPessoa != 0) {
                System.out.println("ID DIFERENTE DE ZERO!");
                System.out.println("Procurando pessoa de id " + vetor[0]);
                Pessoa pessoa = (Pessoa) vetor[1];
                if (pessoa != null) {
                    if (!pessoa.isUserVinculado()) {
                        if (pessoa != null
                                && idPessoa == pessoa.getId()
                                && !pessoa.isUserVinculado()) {
                            ConvidadoFamilia fml = (ConvidadoFamilia) vetor[2];
                            if(fml != null){
                                this.familia = fml;
                            
                            }else{
                                this.familia = null;
                               
                            }
                            this.idPessoa = idPessoa;
                            this.parentesco = (String) vetor[3];
                            this.confirmacao = (boolean) vetor[4];
                            this.dataModificacao = LocalDate.now();
                            this.dataModificacao = null;
                            criou = true;
                        } 
                    } 

                } else {
                    System.out.println("Não foi possivel criar o objeto");
                    Util.mostrarErro("Pessoa de id " + vetor[0] + " não encontrada");
                }

            }

        }
        return criou;
    }
    

    @Override
    public boolean criar(Usuario user, Object[] vetor) {
        System.out.println("CRIANDO O CONVIDADO de ID " + vetor[0]);
        boolean criou = false;

        int idPessoa = (int) vetor[0];
        System.out.println("id convertido para inteiro com sucesso");
      
        if (vetor[0] != null && vetor[1] != null && vetor[2] != null && vetor[3] != null && vetor[4] != null) {
            System.out.println("Nenhum campo nulo!");
            if (idPessoa != 0) {
                System.out.println("ID DIFERENTE DE ZERO!");
                System.out.println("Procurando pessoa de id " + vetor[0]);
                Pessoa p = (Pessoa) vetor[1];
                if (p != null) {
                    if (!p.isUserVinculado()) {
                        if (p != null
                                && idPessoa == p.getId()
                                && !p.isUserVinculado()) {
                            System.out.println("Pessoa encontrada " + p.getNome());

                            ConvidadoFamilia fml = (ConvidadoFamilia) vetor[2];
                            if(fml != null){
                                this.familia = fml;
                            
                            }else{
                                this.familia = null;
                               
                            }
                            this.idPessoa = idPessoa;
                            this.parentesco = (String) vetor[3];
                            this.confirmacao = (boolean) vetor[4];
                            this.dataModificacao = LocalDate.now();
                            this.dataModificacao = null;
                            criou = true;
                        }
                    } 
                }
            }
        }
        return criou; 
    }

    @Override
    public void update(Object[] vetor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LocalDate getDataCriacao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LocalDate getDataModificacao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atualizarDataModificacao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
