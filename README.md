# Material auxiliar da Aula de Java


## Instalando o Git
  - Faça o download [aqui](https://git-scm.com/downloads)
  - Siga os passos de instalação padrão

## Baixando códigos fontes do GitHub
- Copie o link que deseja do GitHub: pasta raíz do projeto > clique no botão "Code" > copiem o endereço
- Abra o terminal GitBash: botão direito no diretório > Git Bash
- No terminal aberto digitem o comando conforme o exemplo:
```sh
git clone https://github.com/proway-curso/curso-java-ba-1-2020.git
```
Seguindo o exemplo os códigos passados na aula serão copidos para seu computador, para copiar seu código feito em sala de aula substitua o endereço.

## Atualizando os fontes
Para atualizar os fontes digitem os segintes comandos na pasta raíz do projeto:
```sh
#para baixar atualizações do GitHub para seu computador, é importante efetuar esse passo antes de alterar seus fontes no computador para evitar conflitos
git pull origin main
#feito isso, agora você pode editar seu fonte
#caso tenham alterações, as consolidem com o comando
git add .
#descreva o que foi alterado
git commit -m "teste de alterações"
#envie as alterações
git push origin main
```

## Configurando o ambiente Java
Procedimento genérico de configuração de ambiente para todos os sistemas operacionais.

- Faça o download e instalem o JDK, esse instalador irá pedir para instalar o JRE também, instalem ambos.
- Façam o download do instalador do Eclipse.
- Abram o instalador do Eclipse e selecionem 'Eclipse IDE for Enterprise Java Developers', depois cliquem em 'INSTALL'.
- Após instalar, abram o Eclipse, acessem 'Window > Preferences'.
- Na janela que foi aberta a esquerda expandam o menu 'Java' e cliquem em 'Installed JREs'.
- Notem que a direita foi aberto uma lista com o JRE/JDK instalado no Eclipse, para facilitar este menu deve conter somente o JDK instalado.
Caso esteja setado alguma instalação de JRE, cliquem em 'Add...' > 'Standard VM' > 'Next' > cliquem em 'Directory' > Selecionem a pasta onde está a instalação do JDK > Cliquem em 'Finish', agora o JDK aparece na listagem, deixem checado o JDK instalado.
Excluam os demais itens, para excluir selecione o item e cliquem em 'Remove'.
- Tendo finalizado este processo cliquem em 'Apply'.
Agora vocês já conseguem criar seus projetos em Java usando o Eclipse em casa.

## Links Uteis
Sites que vocês podem utilizar para treinar

| Site | Link |
| ------ | ------ |
| W3schools | https://www.w3schools.com/ |
| Hacker Rank | https://www.hackerrank.com/ |

