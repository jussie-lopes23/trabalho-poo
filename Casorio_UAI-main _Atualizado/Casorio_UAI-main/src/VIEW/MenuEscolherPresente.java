/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIEW;

import CONTROLLER.DAO;
import MODEL.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Mara
 */
public class MenuEscolherPresente {

    private String nomeClasse;
    private String texto;
    private String vetor[];
    private String valores[];
    private Class classe;
    private int nColetados;
    private DAO dao;
    private int idClasse;
    private Usuario user;

    public void exibir(DAO dao, int idClasse, Usuario user) {
        this.user = user;
        this.dao = dao;
        this.idClasse = idClasse;
        this.vetor = new String[10];
        this.nomeClasse = this.dao.getNameClasseById(idClasse);
        try {
            this.getTexto();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getTexto() {
        this.texto = "";
        this.cleanVetor();
        this.texto = this.dao.getTexto(this.idClasse);
        Class<?> classe = this.dao.getClasseByID(this.idClasse);
        try {
            java.lang.reflect.Method metodo = classe.getMethod("getCampos");
            this.vetor = (String[]) metodo.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        montarPainel(texto);

        return "";
    }

    public void montarPainel(String objetos) {

        String conteudo = "\nATUALIZAR CAMPO DE " + this.nomeClasse.toUpperCase();

        this.valores = new String[10];
        conteudo = "\nATUALIZAR " + this.nomeClasse.toUpperCase();
        conteudo += "\n" + objetos + "\n\n";
        conteudo += "\n\nINSIRA: \nID DO PRESENTE ➡ CONFIRMAR/CANCELAR ESCOLHA:"+"\n"+"DIGITE 0                 ➡ PARA VOLTAR";
        String result = JOptionPane.showInputDialog(null, conteudo, "UaiCasórioPro", JOptionPane.QUESTION_MESSAGE);
        if (result != null) {
            int idInserido = Util.stringToInt(result);
            if (idInserido != 0) {
                this.valores[0] = result;
                try {
                    boolean existe = this.dao.find(this.idClasse, idInserido);
                    if (existe) {
                        Presente presente = (Presente) this.dao.getItemByID(idClasse, idInserido);
                        if (presente != null) {
                            if (presente.getEscolhido()) {
                                if (this.user.getIdPessoa() == presente.getIdPessoa()) {
                                    presente.escolher(this.user.getPessoa());
                                    if (presente.getEscolhido()) {
                                        Util.mostrarMSG("Presente escolhido com sucesso!");
                                    } else {
                                        Util.mostrarMSG("Escolha do presente cancelada!");
                                    }
                                } else {
                                    Util.mostrarMSG("Você não é o presenteador!");
                                }
                            } else {
                                presente.escolher(this.user.getPessoa());
                                if (presente.getEscolhido()) {
                                    Util.mostrarMSG("Presente escolhido com sucesso!");
                                } else {
                                    Util.mostrarMSG("Escolha do presente cancelada!");
                                }
                            }

                        } else {
                            Util.mostrarMSG("Presente não encontrado!");
                        }

                        this.exibir(this.dao, this.idClasse, this.user);
                    } else {
                        Util.mostrarErro("Elemento de id " + result + " não encontrado!");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } else {
            Util.mostrarErro("Atualização cancelada!");
        }

    }

    public boolean add(String atributo) {
        for (int i = 0; i < this.vetor.length; i++) {
            if (this.vetor[i] == null) {
                this.vetor[i] = atributo;
                return true;
            }
        }
        return false;
    }

    public boolean cleanVetor() {
        for (int i = 0; i < this.vetor.length; i++) {
            if (this.vetor[i] != null) {
                this.vetor[i] = null;
                return true;
            }
        }
        return false;
    }

}
