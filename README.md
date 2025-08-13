Consulta de CEP (ViaCEP) em Java
Aplicação simples em Java que faz uma requisição HTTP GET para a API pública ViaCEP, recebe JSON e mapeia para um DTO (EnderecoDto) usando Jackson.

O que o projeto faz
Envia GET https://viacep.com.br/ws/{CEP}/json/
Recebe o JSON da ViaCEP
Desserializa para EnderecoDto com ObjectMapper
Imprime o logradouro no console
