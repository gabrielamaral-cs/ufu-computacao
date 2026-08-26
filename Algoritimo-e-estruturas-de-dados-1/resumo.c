#include <stdio.h>

typedef struct No{
    int dado;
    No *prox;
}No;

typedef struct Lista{
    No *inicio;
}Lista;

void iniciarlista(Lista *l){
    l->inicio = 0;
}

inserir(Lista *l, int elem){
    No *novo = (No *)malloc(sizeof(No));
    if(novo==NULL){
        return 1;
    }
    novo->prox = l->inicio;
    l->inicio = novo;
    return 0;
}

