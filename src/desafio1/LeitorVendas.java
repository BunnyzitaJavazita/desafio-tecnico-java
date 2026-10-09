package desafio1;

import java.io.FileReader;

import com.google.gson.Gson;

public class LeitorVendas {

    public DadosVendas ler() {

        Gson gson = new Gson();

        try {
            FileReader arquivo = new FileReader("dados/vendas.json");

            DadosVendas dados = gson.fromJson(arquivo, DadosVendas.class);

            arquivo.close();

            return dados;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}