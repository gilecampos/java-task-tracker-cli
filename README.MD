# Caso de Uso: Task Tracker CLI

## Objetivo
Desenvolver uma aplicação de linha de comando (CLI) para gerenciar tarefas, permitindo ao usuário adicionar, atualizar, excluir, listar e marcar tarefas como pendentes, em andamento ou concluídas. As tarefas devem ser salvas em um arquivo JSON na pasta do projeto.

## Fluxo Principal
1. **Adicionar tarefa**
   - Comando: `task-cli add "Descrição da tarefa"`
   - Resultado: Tarefa criada com status "todo" e salva no arquivo JSON.

2. **Atualizar tarefa**
   - Comando: `task-cli update <id> "Nova descrição"`
   - Resultado: Descrição da tarefa alterada e data de atualização registrada.

3. **Excluir tarefa**
   - Comando: `task-cli delete <id>`
   - Resultado: Tarefa removida do arquivo JSON.

4. **Marcar tarefa como em andamento**
   - Comando: `task-cli mark-in-progress <id>`
   - Resultado: Status da tarefa alterado para "in-progress".

5. **Marcar tarefa como concluída**
   - Comando: `task-cli mark-done <id>`
   - Resultado: Status da tarefa alterado para "done".

6. **Listar tarefas**
   - Comando: `task-cli list`
   - Resultado: Exibe todas as tarefas cadastradas.

7. **Listar tarefas por status**
   - Comando: `task-cli list done`, `task-cli list todo`, `task-cli list in-progress`
   - Resultado: Exibe apenas as tarefas com o status escolhido.

## Propriedades de cada tarefa
- `id`: identificador único
- `description`: descrição da tarefa
- `status`: "todo", "in-progress" ou "done"
- `createdAt`: data/hora de criação
- `updatedAt`: data/hora da última atualização

## Regras e restrições
- O arquivo JSON deve ser criado automaticamente se não existir.
- Não utilizar bibliotecas externas.
- Tratar erros e casos de uso inválidos com mensagens claras.

## Recomendações de desenvolvimento
- Implemente cada funcionalidade separadamente e teste antes de avançar.
- Utilize argumentos posicionais para os comandos.
- Garanta que as tarefas sejam persistidas corretamente no arquivo JSON.
- Documente o projeto e escreva instruções de uso no README.

---
Esse caso de uso serve como guia para o desenvolvimento do projeto por etapas, garantindo que todos os requisitos sejam atendidos.