package org.aplicacao.servicos;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.aplicacao.dto.EnderecoDto;

public class ApiServico {

  EnderecoDto enderecoDto = new EnderecoDto();

  public EnderecoDto getEndereco(String cep) throws IOException, InterruptedException {
    try {
        // //Cria um cliente HTTP.
        HttpClient client = HttpClient.newHttpClient();

        //Cria a requisição com metodo GET para a URL da API ViaCEP, baseada no CEP informado.
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/"))
            .build();
        //Envia a requisição e recebe a resposta como String (em JSON).
        HttpResponse<String> response =
            client.send(request, HttpResponse.BodyHandlers.ofString());

        //Desserializacao transfere os dados retornados em JSON para um OBJETO
        ObjectMapper mapper = new ObjectMapper();
        enderecoDto = mapper.readValue(response.body(), EnderecoDto.class);
      } catch (Exception  e) {
        System.out.println(e.getMessage());
      }
    //Retorna o objeto populado com os dados da API.
    return enderecoDto;
  }

}
