# Terminal e Argumentos

Nossos códigos em java nem sempre serão executados por uma __IDE__ e para que possam ser executados por um exemplo para nossos clientes de outras formas precisamos criar executaveis que serão executados nos seus dispositivos.

## Terminal

Para executarmos um arquivo java precisamos identificar seu respectivo diretório e confirmar se na pasta bin existe o arquivo compilado que teria o nome __<nome_da_classe>.class__.

Acessando o diretório:
> no linux      /home/seu_nome/nome_do_diretório/nome_do_projeto_java/bin
> no windows    C:\Users\Seu_Nome\Nome_do_diretório\Nome_do_projeto_java\bin

Verificando se existe o arquivo .class
> no linux      ls *.class
> no windows    dir*.class

Caso não existam arquivos compilados podemos executar o seginte comando para compilar
*Obs: Esse comando só irá funcionar corretamente caso esteja no diretório /bin*
> javac ../src/<nome_da_classe>.java -d .

Depois executamos o comando java
> java <nome_da_classe>
