package com.company;

public class ControleRemoto     {
    Boolean BotaoIsPressed;
    String cor;
    int QntDeBotoes;
    String marca;
    void status(){
        System.out.println("O controle da " +this.marca+" tem "+this.QntDeBotoes+" Botões.");
        System.out.println("e o botão : ");
    void StatusBotão(){
        if (BotaoIsPressed == true){
            System.out.println("Está pressionado");
            } else {
            System.out.println("Não está pressionado")
        }
        }
    }
    void PressBotao(){
        if (BotaoIsPressed == false) {
            System.out.println("Botão pressionado");
            this.BotaoIsPressed = true;
        } else {
        }
    }

}

