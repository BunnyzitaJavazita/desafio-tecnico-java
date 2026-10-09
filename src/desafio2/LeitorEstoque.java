package desafio2;

import java.io.FileReader;

import com.google.gson.Gson;

public class LeitorEstoque {

    public DadosEstoque ler() {

        Gson gson = new Gson();

        try {

            FileReader arquivo = new FileReader("dados/estoque.json");

            DadosEstoque dados = gson.fromJson(arquivo, DadosEstoque.class);

            arquivo.close();

            return dados;

        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }
    }
}