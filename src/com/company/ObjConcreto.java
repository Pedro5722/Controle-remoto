package com.company;

public class ObjConcreto {

    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();
        c1.QntDeBotoes = 32;
        c1.BotaoIsPressed = true;
        c1.cor = "branco";
        c1.marca = "Samsung";

        c1.status();
        c1.PressBotao();
        c1.status();
    }
}
