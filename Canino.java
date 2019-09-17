/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public abstract class Canino extends Animal {
    
    public Canino() {
    }
    public Canino(String comida, String habitat) {
        super(comida, habitat);
    }

    @Override
    public String getComida() {
        return comida;
    }
    @Override
    public void setComida(String comida) {
        this.comida = comida;
    }
    @Override
    public String getHabitat() {
        return habitat;
    }
    @Override
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    @Override
    public String makeNoise() {
        return "Barulho.";
    }
}