/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

/**
 *
 * @author nodot
 */
public class Participante {
    private String nome,tamanhoCamisa,istituicao,time;

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanhoCamisa() {
        return tamanhoCamisa;
    }

    public void setTamanhoCamisa(String tamanhoCamisa) {
        this.tamanhoCamisa = tamanhoCamisa;
    }

    public String getIstituicao() {
        return istituicao;
    }

    public void setIstituicao(String istituicao) {
        this.istituicao = istituicao;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    

    @Override
    public String toString() {
        return "Participante\t" + "nome:" + nome + "\n" +"tamanhoCamisa:" + tamanhoCamisa + "\n" + "istituicao:" + istituicao + "\n" +"time:" + time + "\n";
    }
    
}


