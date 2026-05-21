# Relógio Digital com JavaFX

Aplicação desktop simples que exibe um relógio digital em tempo real.

![Demonstração do Relógio Digital](./assets/relogio-digital.gif)

## Repositório

[relogio-digital](https://github.com/p-rcorreia/relogio-digital.git)

## Objetivo

Criar uma interface gráfica com JavaFX que mostra a hora atual e atualiza os segundos continuamente.

## Conceitos praticados

- JavaFX
- `LocalDateTime`
- `DateTimeFormatter`
- `Timeline`
- `KeyFrame`
- `Duration` do JavaFX
- Atualização contínua de interface
- Estilização simples com CSS inline

## Funcionalidades

- Exibe a hora atual no formato `HH:mm:ss`
- Atualiza a exibição a cada segundo
- Usa fundo preto e texto amarelo
- Mantém a atualização enquanto a janela está aberta

## Status

Concluído.

## Como funciona

O relógio usa `LocalDateTime.now()` para obter a hora atual e `DateTimeFormatter` para formatar o texto no padrão `HH:mm:ss`.

A atualização contínua é feita com uma `Timeline` do JavaFX. Um `KeyFrame` atualiza o texto do rótulo e outro define o intervalo de um segundo.

## Como executar

No PowerShell, com a variável `PATH_TO_FX` apontando para a pasta `lib` do JavaFX:

```powershell
javac --module-path "$env:PATH_TO_FX" --add-modules javafx.controls RelogioDigital.java
java --module-path "$env:PATH_TO_FX" --add-modules javafx.controls RelogioDigital
```

## Arquivo principal

```txt
RelogioDigital.java
```
