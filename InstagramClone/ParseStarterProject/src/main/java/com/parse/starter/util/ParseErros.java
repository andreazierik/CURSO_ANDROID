package com.parse.starter.util;

import android.content.IntentFilter;

import java.util.HashMap;

public class ParseErros {

    private HashMap<Integer, String> erros;

    public ParseErros() {

        this.erros = new HashMap<>();
		this.erros.put(100, "Erro ao conectar com o servidor, verifique sua conexão ou tente mais tarde!");
		this.erros.put(119, "Operação negada!");
		this.erros.put(125, "E-mail inválido!");
		this.erros.put(200, "Nome do usuário não foi preenchido!");
        this.erros.put(201, "A senha não foi preenchida!");
        this.erros.put(202, "Usuário já existe, escolha um outro nome de usuário!");
		this.erros.put(203, "E-mail já existe, escolha um outro e-mail!");
		this.erros.put(204, "E-mail não foi preenchido!");
		this.erros.put(205, "E-mail não cadastrado!");
		this.erros.put(206, "Falha de sessão, reconecte novamente!");

    }

    public String getErro(int codErro){
        return this.erros.get( codErro );
    }

}