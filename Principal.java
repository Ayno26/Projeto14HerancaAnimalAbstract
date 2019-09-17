/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Felipe
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gato objGato = new Gato("Peixe", "Doméstico");
        Leao objLeao = new Leao("Carne", "Selva");
        Tigre objTigre = new Tigre("Carne", "Floresta");
        Cao objCao = new Cao("Ração", "Doméstico");
        Lobo objLobo = new Lobo("Carne", "Montanhas");
        Siames objSiames = new Siames("Peixe", "Doméstico");
        
        System.out.println("Gato"+"\nComida: "+objGato.getComida()+
                " Habitat: "+objGato.getHabitat()+
                " Braulho: "+objGato.makeNoise()+
                " Raça: "+objGato.raça());
        System.out.println("\nLeao"+"\nComida: "+objLeao.getComida()+
                " Habitat: "+objLeao.getHabitat()+
                " Braulho: "+objLeao.makeNoise()+
                " Origem: "+objLeao.origem());
        System.out.println("\nTigre"+"\nComida: "+objTigre.getComida()+
                " Habitat: "+objTigre.getHabitat()+
                " Braulho: "+objTigre.makeNoise()+
                " Cor: "+objTigre.cor());
        System.out.println("\nCao"+"\nComida: "+objCao.getComida()+
                " Habitat: "+objCao.getHabitat()+
                " Braulho: "+objCao.makeNoise()+
                " Tamanho: "+objCao.tamanho());
        System.out.println("\nLobo"+"\nComida: "+objLobo.getComida()+
                " Habitat: "+objLobo.getHabitat()+
                " Braulho: "+objLobo.makeNoise()+
                " Peso: "+objLobo.peso());
    }    
}