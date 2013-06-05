mae_de(claudia, guilherme).
mulher(claudia).
homem(guilherme).
mae_de(claudia, gabriele).
mulher(gabriele).
pai_de(alexandre, guilherme).
homem(alexandre).
pai_de(alexandre, gabriele).
pai_de(alexandre, mateus).
homem(mateus).
pai_de(alexandre, rafaela).
mulher(rafaela).
mae_de(luciana, rafaela).
mulher(luciana).
mae_de(luciana, mateus).
irmas_de(X,Y) :- (pai_de(Z,X), pai_de(Z,Y); mae_de(Z,X), mae_de(Z,Y)), mulher(Y), X\=Y.
irmaos_de(X,Y) :- (pai_de(Z,X), pai_de(Z,Y); mae_de(Z,X), mae_de(Z,Y)), homem(Y), X\=Y.

cria_irmas_de(ARQ,X,Y) :- irmas_de(X,Y),  
tell(ARQ),  
write('<PARENTE>'), nl,  
write(' <PESSOA>'), write(X), write('</PESSOA>'), nl,  
write(' <IRMAO>'), write(Y), write('</IRMAO>'), nl,  
write('</PARENTE>'), nl,  
flush,  
tell(user).

cria_irmaos_de(ARQ,X,Y) :- irmaos_de(X,Y),  
tell(ARQ),  
write('<PARENTE>'), nl,  
write(' <PESSOA>'), write(X), write('</PESSOA>'), nl,  
write(' <IRMAO>'), write(Y), write('</IRMAO>'), nl,  
write('</PARENTE>'), nl,  
flush,  
tell(user).
