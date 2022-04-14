# BootCamp Dio Java
Neste diretório estão alguns dos projetos desenvolvidos durante o BootCamp Get Started Java que realizei na plataforma da Digital Innovation One (DIO).

## Comandos Básicos para Manusear Git Bash
Iniciar Repositório Remoto
```
git init
```

Adicionar Repositório Remoto
```
git remote add origin https://github.com/user/repo.git
```

Para clonar o projeto no PC
```
git clone git@github.com:<usuário>/<projeto>
```

Adicionar arquivos para o commit
```
git add arquivos
```

Para realizar o commit
```
git commit -m "nome commit"
```

Para fazer o Upload para o repositorio - sendo branch a sua propria branch
```
git push -u origin branch
```

Ir para master e atualizar repositório
```
git checkout master
git pull
```

Criar novo branch "main"
```
git checkout -b main
```

Enviar o novo branch para o Github
```
git push -u origin main
```

Desfazer um Push (3 passos):
```
git reset --mixed hash-do-penultimo-commit 
git stash
```

```
git revert hash-do-ultimo-commit
```

```
git stash apply
```
## Links Úteis
[Sintaxe Básica Markdown](https://www.markdownguide.org/basic-syntax)
