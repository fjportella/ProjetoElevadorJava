/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevador;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class Elevador {

    public int numpessoas;
    private int numandar;
    public int totandar;
    public int totpessoas;

    
    //Métodos
    public void subir() {
        if (this.getNumandar() >= this.getTotandar()) {
            JOptionPane.showMessageDialog(null, "O prédio possui apenas "
                    + this.getTotandar() + " Andares");
        } else {

            numandar++;
        }
    }

    public void descer() {

        if (this.getNumandar() <= 0) {
            JOptionPane.showMessageDialog(null, "Você não pode descer além "
                    + "do Terreo!");
        } else {
            numandar--;
        }
    }

    public void entrar() {
        if (this.getNumpessoas() >= this.getTotpessoas()) {
            JOptionPane.showMessageDialog(null, "A capacidade é até "
                    + this.getTotpessoas() + " pessoas");
        } else {

            numpessoas++;
        }
    }

    public void sair() {
        if (this.getNumpessoas() <= 0) {
            JOptionPane.showMessageDialog(null, "A capacidade não pode ser "
                    + "menor que Zero Pessoas!");
        } else {

            numpessoas--;
        }
    }

    //Métodos Especiais
    public int getNumpessoas() {
        return numpessoas;
    }

    public void setNumpessoas(int numpessoas) {
        this.numpessoas = numpessoas;
    }

    public int getNumandar() {
        return numandar;
    }

    public void setNumandar(int numandar) {
        this.numandar = numandar;
    }

    public int getTotandar() {
        return totandar;
    }

    public void setTotandar(int totandar) {
        this.totandar = totandar;
    }

    public int getTotpessoas() {
        return totpessoas;
    }

    public void setTotpessoas(int totpessoas) {
        this.totpessoas = totpessoas;
    }

}
