pai_de(alexandre,guilherme).
pai_de(alexandre,fernando).
mae_de(claudia,guilherme).
mae_de(claudia,joao).
mae_de(claudia,mateus).
pai_de(alexandre,gabriele).
mae_de(claudia,gabriele).
homem(alexandre).
homem(joao).
homem(fernando).
homem(mateus).
homem(guilherme).
mulher(claudia).
mulher(luciana).
mulher(gabriele).

irmas_de(X,Y) :- (pai_de(Z,X), pai_de(Z,Y); mae_de(Z,X), mae_de(Z,Y)), mulher(Y), X\=Y.
irmaos_de(X,Y) :- (pai_de(Z,X), pai_de(Z,Y); mae_de(Z,X), mae_de(Z,Y)), homem(Y), X\=Y.
avos_de(X,Y):-((pai_de(Z,Y),pai_de(X,Z));(mae_de(Z,Y),pai_de(X,Z))),homem(X).
avohs_de(X,Y):-((pai_de(Z,Y),mae_de(X,Z));(mae_de(Z,Y),mae_de(X,Z))),mulher(X).


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

cria_avos_de(ARQ,X,Y) :- avos_de(X,Y),  
tell(ARQ),  
write('<PARENTE>'), nl,  
write(' <PESSOA>'), write(X), write('</PESSOA>'), nl,  
write(' <IRMAO>'), write(Y), write('</IRMAO>'), nl,  
write('</PARENTE>'), nl,  
flush,  
tell(user).  

cria_avohs_de(ARQ,X,Y) :- avohs_de(X,Y),  
tell(ARQ),  
write('<PARENTE>'), nl,  
write(' <PESSOA>'), write(X), write('</PESSOA>'), nl,  
write(' <IRMAO>'), write(Y), write('</IRMAO>'), nl,  
write('</PARENTE>'), nl,  
flush,  
tell(user). 