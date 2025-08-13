package org.aplicacao;

import java.io.IOException;
import org.aplicacao.dto.EnderecoDto;
import org.aplicacao.servicos.ApiServico;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {

    ApiServico apiServico = new ApiServico();
    try {
      EnderecoDto enderecoDto = apiServico.getEndereco("05202270");
      System.out.println(enderecoDto.getLogradouro());
    } catch (IOException e) {
       throw new RuntimeException(e);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }


    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

  }
}