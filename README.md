# Accenture
Freame-UI-Java
   Projeto  de testes de UI automatizados com Java e Selenium WebDriver

Inicialização
   Para o desenvolvimento dessa aplicação  de teste , foram utilizadas as seguintes ferramentas:
   1.Java
   2. Cucumber
   3. HTTParty
   4. Rspec
   5.Git

Pré requisitos
   Necessario instalar o Java na versão mais recente e em seguida rodar os comandos atraves do terminal:
   gem install bundler --force
   
Instalação
   Clone o projeto no diretorio de interesse e abra o terminal dentro da pasta do projeto:
   git clone <url-clone-projeto>
   url: https://github.com/Diogo1994/Accenture
   
Execute o comando abaixo para realizar a instalação das dependencias:
   bundle install
   
Executando os testes
   Após a instalação das dependencias e configuração do ambiente, vamos executar os teste:
   cucumber -t @tag -p [ambiente]
   Ex: cucumber -t @tag -p dev
