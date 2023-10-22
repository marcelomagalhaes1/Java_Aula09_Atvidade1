/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inverterpalavras;

/**
 *
 * @author Marcelo
 */
public class InverterPalavras {

    public static String inverterPalavras(String input) {
        String[] palavras = input.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            resultado.append(new StringBuilder(palavra).reverse()).append(" ");
        }

        return resultado.toString().trim();
    }

    public static void main(String[] args) {
        String exemplo1 = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String resultado1 = inverterPalavras(exemplo1);
        System.out.println(resultado1);

        String exemplo2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";
        String resultado2 = inverterPalavras(exemplo2);
        System.out.println(resultado2);
    }
}
