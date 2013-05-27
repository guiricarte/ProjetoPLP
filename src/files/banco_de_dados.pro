pai_de(maria, joão).
homem(joão).
mulher(maria).
pai_de(ana, joão).
mulher(ana).
pai_de(pedro, joaquim).
homem(joaquim).
homem(pedro).
pai_de(luiza, pedro).
mulher(luiza).
pai_de(carla, pedro).
mulher(carla).
irmao_de(X,Y) :- pai_de(Z,X), pai_de(Z,Y), X \= Y.
