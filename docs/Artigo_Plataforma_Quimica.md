IFRS – Campus Rolante
Informática
Plataforma de Estudos de Química
Autores: Henrique Reis Queiroz; Vitor Souza
Local: Rolante
Ano: 2026
Resumo
Este trabalho apresenta o desenvolvimento de uma ferramenta educacional de apoio ao estudo de Química no Ensino Médio, construída em Java com interface gráfica Swing. A proposta inicial era organizar conteúdos de Química em uma plataforma de consulta. Na versão compilada analisada, o foco está na exploração de elementos químicos e na manipulação das quantidades de elétrons e nêutrons, incluindo rotinas relacionadas à verificação de íons e isótopos e ao registro de informações em tabela.

Palavras-chave: Ensino de Química; Java; Swing; Estrutura atômica; Software educacional.
1. Introdução
A Química está presente em diversas situações do cotidiano e possui grande importância na formação dos estudantes do Ensino Médio. Entretanto, alguns conteúdos da disciplina podem apresentar dificuldades de compreensão, principalmente quando envolvem conceitos, fórmulas, classificações e diferentes representações. Nesse contexto, recursos digitais interativos podem apoiar a visualização de conceitos e a revisão dos conhecimentos estudados em sala de aula.

Este projeto propõe o desenvolvimento de uma plataforma educacional de Química utilizando a linguagem de programação Java e a biblioteca gráfica Swing. A ideia inicial consistia em disponibilizar conteúdos organizados por menus. Entretanto, a inspeção da versão compilada disponível indica uma implementação voltada principalmente ao estudo da estrutura atômica, por meio da seleção de elementos e de operações sobre partículas subatômicas.

O trabalho busca relacionar conhecimentos de Informática e Química, descrevendo o desenvolvimento do sistema e discutindo seu potencial como ferramenta complementar ao ensino. A plataforma não pretende substituir aulas ou materiais didáticos, mas oferecer uma forma adicional de explorar os conceitos.
2. Objetivos
2.1 Objetivo geral
Desenvolver e analisar uma ferramenta educacional em Java para apoiar a aprendizagem e a revisão de conceitos de Química do Ensino Médio, com ênfase na estrutura atômica e em uma interface gráfica interativa.
2.2 Objetivos específicos
- Selecionar elementos químicos e apresentar informações associadas a eles.
- Disponibilizar controles para alterar as quantidades de elétrons e nêutrons na representação do átomo.
- Relacionar as alterações realizadas aos conceitos de carga elétrica, íons e isótopos.
- Organizar as operações do sistema em classes Java e componentes da interface Swing.
- Verificar o comportamento das funcionalidades e registrar limitações e possibilidades de melhoria.
3. Fundamentação teórica
A estrutura de um átomo pode ser descrita, em um modelo introdutório, pela presença de prótons e nêutrons no núcleo e elétrons na região extranuclear. O número de prótons define o elemento químico, enquanto a quantidade de elétrons determina a carga elétrica total da espécie. Quando o número de elétrons difere do número de prótons, forma-se um íon: um cátion, quando a carga é positiva, ou um ânion, quando a carga é negativa.

Átomos de um mesmo elemento, com igual número de prótons e diferentes quantidades de nêutrons, são denominados isótopos. O número de massa corresponde à soma de prótons e nêutrons. Essas relações podem ser exploradas por simulações simples, nas quais o estudante modifica parâmetros e observa as consequências conceituais das mudanças.

No desenvolvimento de aplicações para desktop, Java permite estruturar o programa em classes e métodos, enquanto Swing fornece componentes gráficos, como janelas, botões, rótulos, painéis e tabelas. A separação entre interface e lógica de funcionamento pode facilitar a organização e a manutenção do código.
4. Metodologia
O projeto foi concebido como uma aplicação educacional para desktop. A etapa inicial compreendeu a definição da proposta de estudo de Química e o planejamento de uma interface voltada aos estudantes. Para examinar a versão disponível do programa, foi realizada uma inspeção estática do arquivo compilado no formato JAR, observando sua estrutura interna e os nomes e as assinaturas de classes e métodos.

O arquivo examinado contém as classes Controlador.Controlador e View.TelaInicial, além de uma classe interna relacionada à tela. A classe de interface estende JFrame, componente da biblioteca Swing. A classe Controlador reúne métodos associados a elementos químicos e a operações como Adicionar, Subtrair, Verificar, Adicionar_N, Subtrair_N, CarregarIsotopos, VerificarIsotopo e Salvar.

A inspeção de nomes e assinaturas permite identificar indícios das funcionalidades previstas na aplicação, mas não comprova, por si só, o funcionamento correto de cada recurso. Por isso, as descrições das funcionalidades são tratadas como identificadas na estrutura do programa, e não como resultados de testes completos.
5. Desenvolvimento do software
A organização identificada possui duas classes centrais. View.TelaInicial é responsável pela janela principal da aplicação e contém o método main, ponto de entrada do programa. Controlador.Controlador concentra métodos para selecionar elementos e realizar operações relacionadas à composição atômica. O controlador também recebe referências a componentes gráficos, como JLabel e JPanel, indicando integração com a interface.

Foram identificados métodos nomeados para 27 elementos químicos, incluindo hidrogênio, carbono, oxigênio, sódio, cloro e ferro. Além da seleção dos elementos, existem métodos relacionados à adição ou subtração de partículas, à verificação de estados, ao carregamento e à verificação de isótopos e ao registro de informações por meio de um DefaultTableModel. Esse componente do Swing é utilizado para gerenciar dados apresentados em tabelas.

A implementação possui potencial para favorecer a aprendizagem ao permitir comparar diferentes configurações de um átomo. Por exemplo, a alteração na quantidade de elétrons pode ser relacionada à carga elétrica, enquanto a mudança no número de nêutrons pode ser utilizada para discutir isótopos. Esse potencial pedagógico, contudo, depende do funcionamento correto dos recursos e de sua validação em testes.
6. Resultados e discussão
A inspeção do arquivo JAR identificou uma estrutura compilada em Java com interface Swing, uma classe controladora e métodos relacionados a 27 elementos químicos. Também foram identificadas operações associadas à manipulação de elétrons e nêutrons, à consulta de isótopos e ao armazenamento de dados em tabela.

Esses achados indicam que o projeto passou de uma proposta geral de consulta a conteúdos para uma ferramenta com foco específico na estrutura atômica. Entretanto, como a análise se baseou na estrutura do arquivo compilado, não foi possível confirmar, apenas por essa inspeção, a precisão de todos os cálculos, a usabilidade da interface ou o funcionamento integral de cada recurso. Esses aspectos devem ser avaliados por meio de testes funcionais e, se possível, de atividades com estudantes.
7. Considerações finais
A plataforma de estudos de Química representa uma aplicação prática dos conhecimentos de programação na construção de recursos educacionais. A estrutura do programa analisado reúne componentes de interface gráfica e métodos voltados à exploração de conceitos de estrutura atômica, íons e isótopos.

A inspeção do arquivo compilado permitiu identificar recursos que podem contribuir para a revisão de conteúdos de Química, especialmente por meio da interação com elementos químicos e da alteração de quantidades de partículas subatômicas. Ainda assim, a confirmação de sua eficácia educacional e da confiabilidade de suas funcionalidades depende de testes adicionais.

Como continuidade do projeto, sugere-se realizar testes funcionais, revisar a precisão dos dados e cálculos apresentados e avaliar a interface com usuários, de modo a identificar melhorias que tornem a ferramenta mais clara, acessível e útil para o estudo.
Referências e fontes do projeto
QUEIROZ, Henrique Reis; SOUZA, Vitor. Plataforma de estudos de química. Esboço de projeto escolar. IFRS – Campus Rolante, 2026.

PROJETO PLATAFORMA DE ESTUDOS DE QUÍMICA. Trabalho_Final_Quimica.jar.jar. Arquivo compilado Java disponibilizado para análise, 2026.

BRASIL. Ministério da Educação. Base Nacional Comum Curricular. Brasília, DF: MEC, 2018. Disponível em: https://basenacionalcomum.mec.gov.br/. Acesso em: 22 nov. 2026.

JOHNSTONE, A. H. Why is science difficult to learn? Things are seldom what they seem. Journal of Computer Assisted Learning, v. 7, n. 2, p. 75–83, 1991. DOI: https://doi.org/10.1111/j.1365-2729.1991.tb00230.x.

ORACLE. Creating a GUI with Swing. The Java Tutorials. Disponível em: https://docs.oracle.com/javase/tutorial/uiswing/index.html. Acesso em: 22 nov. 2026.

UNIVERSITY OF COLORADO BOULDER. Build an Atom. PhET Interactive Simulations. Disponível em: https://phet.colorado.edu/en/simulations/build-an-atom. Acesso em: 22 nov. 2026.
