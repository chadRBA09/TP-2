#include <stdio.h>

typedef struct Jogador{
    private:
    char id[100];
    char nome[100];
    char peso[100];
    char universidade[100];
    char anoNascimento[100];
    char cidadeNascimento[100];
    char estadoNascimento[100];
} Jogador;

Jogador clone (Jogador *jogador)
{ 
    Jogador novo = *jogador; // copia todos os campos de jogador para novo
    return novo;
}

void imprimir ()
{
    printf("[%s ## %s ## %s ## %s ## %s ## %s ## %s ##]\n", jogador.id, jogador.nome, jogador.altura, jogador.peso, jogador.anoNascimento, jogador.cidadeNascimento, jogador.estadoNascimento, jogador.universidade);
}





int main () 
{
    char entrada[1000];
    FILE* arq = fopen("players.csv","r");
    Jogador jogador[3922];
    fgets (entrada, sizeof(entrada), arq); // pula a primeira linha do arquivo
    int i = 0; // contador para jogadores
    while (fgets (entrada, 1000, arq))
    {
        
    }

}